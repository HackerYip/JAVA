import java.util.Scanner;

public class Test {

    public static int fac2(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + fac2(n-1);
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("1~10的递归相加的结果为 " + fac2(10));
    }




    public static int fac(int n){//n*(n-1)
        if(n == 1){
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + "的阶乘的结果是 "+ fac(n));
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array[10]);//ArrayIndexOutOfBoundException

        System.out.println(array[3]);// 4
        array[3] = 99;//change
        System.out.println(array[3]);// 99
    }


    public static void main3(String[] args) {
        int[] array;
        //array = {1,2,3,4,5,};//ERROR
        array = new int[]{1,2,3,4,5};
        array = new int[]{9,8,7,6,5};

        int[] array2 = {1,2,3,4,5};//once, no more twice
        //array2 = {9,8,7,6,5};//once, no more twice

        boolean[] booleans = new boolean[10];
        System.out.println("fasdsad");
    }

    public static void main2(String[] args) {
        double[] array = new double[10];//默认用0初始化
        String[] strings = new String[10];//引用类型，默认用null初始化


        System.out.println("fsfas");
    }


    public static void main1(String[] args) {
          int a1 = 1;
          int a2 = 2;
          int a3 = 3;
          int a4 = 4;
          //1.中括号 当中  不能有任何的数字
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,10};

        int ret = array[2];
        System.out.println("array数组的2下表元素是: " + ret);

        int[] array3 = new int[10];//没有初始化，那么有没有默认值呢?
        array3[0] = 10;//不清楚数组里面的元素，类比动态内存分配

        System.out.println(array.length);//根据数组名.length来自动获取 数组的长度
    }

}
