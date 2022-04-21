public class TestDemo {

    //什么是异常
    public static void main(String[] args) {

        int a = 10/0;
        System.out.println(a);//算数异常

        int[] array = null;
        System.out.println(array.length);//空指针异常

        int[] array2 = {1,2,3};
        System.out.println(array2[9]);//数组越界



    }
}

