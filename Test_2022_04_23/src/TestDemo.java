import java.util.Scanner;

//自定义异常
//自定一个类，让此类继承于一个异常类即可，一般我们建议继承2个中的一个
//1.Exception，默认就是一个受查异常，或者是一个编译时异常 -> 必须"处理"之后，才能运行
//try catch是真正的处理方式   throws只是声明，真正还会交给JVM处理
//2.RuntimeException 运行时异常，非受查异常

public class TestDemo {

    public static void func2() {
        int[] array = {1,2,3};
        System.out.println(array[100]);
    }

    public static void main(String[] args) {
        try{
            func2();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("fafafafafafa");//处理后正常执行，不处理就交给JVM
    }

    public static int func() {
        try{
            System.out.println(10/10);
            return 10;
        }catch (ArithmeticException e){
            System.out.println("这里捕捉到了算数异常!");
        }finally{
            //return -1;//因为finally这个代码块一定会被执行的，虽然try里面写了return，但是最终还是会执行finally里面的
            // 所以尽量不要在finally语句中进行return
        }
        return 9;//这样就不会抛异常了
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println(10/0);
            System.out.println("abcdef");
        }catch(ArithmeticException e){
            System.out.println("捕获到了算数异常 ");
            e.printStackTrace();
        }finally {
            scanner.close();
            System.out.println("一般用来关闭资源");//这一行代码，不管是否发生异常，finally一定会被执行
        }
        System.out.println("其他业务逻辑");
    }


    public static void func3(int a) throws CloneNotSupportedException{
        if(a == 10){//这里不拿try catch处理异常的话，就要throws声明异常
            //但是这里和下面的try catch不一样，这里只是声明异常，处理了受查异常而已
            //真正要在main函数调用func3的时候，同样会报错，因为没处理异常
            throw new CloneNotSupportedException("a==10");
        }
    }

    public static void func2(int a){
        try{
            if(a == 10){
                throw new CloneNotSupportedException("a==10");
            }
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }//这里是自己处理的，所以下面main函数调用的时候，可以执行后面的打印业务，没有交给JVM处理异常

    public static void main4(String[] args) {
        try{
            func3(10);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }//所以这里来处理func3的异常
        func2(10);
        System.out.println("dasdasd");
    }

    public static void main5(String[] args) throws CloneNotSupportedException{
        func3(10);
        System.out.println("fafaf");
        //这里还是没有处理异常，只是不会发生编译异常，但是还是交给了JVM处理

        //1.编译时异常必须处理
        //2.运行时异常可以不处理
        //3.程序员处理了异常，没处理，就会交给JVM处理，异常终止了程序


    }
    public static void main1(String[] args) {
        //有时候我们抛出的异常是存在父子类关系的
        //所有的异常都继承于Exception
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[9]);
            System.out.println("haha");
//        }catch(Exception e){
//            e.printStackTrace();//此时编译器懵了，不管抛出啥异常编译器都能捕捉到
//            //所以不能把父类放在最前头
        }
        catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();//要放在这里，兜底
            //放在这里的意思就是
            //假设程序捕获不到上面所写的异常
            //那么就在这一段代码里面拦住所有的异常
        }
    }



}
