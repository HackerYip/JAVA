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

    public static void main(String[] args) {
        try{
            func3(10);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }//所以这里来处理

        func2(10);
        System.out.println("dasdasd");
    }









    public static void func(int a){
        if(a == 0){
            throw new NullPointerException();
        }
    }

    public static void main2(String[] args) {
        func(10);
        throw new NullPointerException();
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3};
        try{
            System.out.println(array[9]);//数组越界，这里抛出异常，就不会执行剩下的代码
            //所以程序当中，同时只能抛出一个异常
            func(10);//这里抛出的空指针异常就不捕捉了，因为上面异常了
            System.out.println("hahahah，这里没有执行");//这行代码及以下都不会执行
        }catch(ArrayIndexOutOfBoundsException | NullPointerException e){//但是只能同时捕捉一个异常，
            e.printStackTrace();//打印以下异常信息
            System.out.println("捕获到了一个数组越界的异常！！可以发给你一个邮件，告知你原因");
        }
        System.out.println("其他业务");
    }








    //什么是异常
    //1.受查异常【编译时异常】
    //2.非受查异常【运行时异常】


    public static void main1(String[] args) {

//        int a = 10/0;
//        System.out.println(a);//算数异常
//
//        int[] array = null;
//        System.out.println(array.length);//空指针异常

        int[] array2 = {1,2,3};

         //所有异常其实都是一个类

        try{
            System.out.println(array2[9]);//数组越界
            System.out.println("hahahah，这里没有执行");//这行代码及以下都不会执行
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印以下异常信息
            System.out.println("捕获到了一个数组越界的异常！！可以发给你一个邮件，告知你原因");
        }
        System.out.println("其他业务");
    }
}

