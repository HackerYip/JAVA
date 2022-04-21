public class TestDemo {

    public static void func2(int a){
        if(a == 0){
            throw new RuntimeException("a == 10");
        }
    }

    public static void main2(String[] args) {
        func2(10);
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
            System.out.println("捕获到了一个数组越界的异常！！可以发给你一个邮件，告知你原因");
        }
        System.out.println("其他业务");
    }
}

