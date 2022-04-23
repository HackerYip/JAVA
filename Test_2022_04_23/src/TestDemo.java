public class TestDemo {

    public static void func3(int a) throws CloneNotSupportedException{
        if(a == 10){//这里不拿try catch处理异常的话，就要throws声明异常
            //但是这里和下面的try catch不一样，这里只是声明异常，处理了受查异常而已
            //真正要在main函数调用func3的时候，同样会报错，因为没处理异常
            throw new CloneNotSupportedException("a==10");
        }
    }//

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

}
