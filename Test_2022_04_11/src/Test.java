import java.util.Arrays;
import java.util.Scanner;

public class Test {







    public static void main9(String[] args) {
        int[] array1 = {1,2,3,4};

        int[] array2 = array1;//这个引用array2指向了array1所指向的对象
        System.out.println("array1:" + Arrays.toString(array1));
        System.out.println("array2:" + Arrays.toString(array2));


    }


    public static void main8(String[] args) {
        int[] array = {123};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //for-each 增强for循环，还可以用到打印集合当中的元素
        for( int x: array ){
            System.out.println(x + " ");
        }

        //借助JAVA本身提供的一些方法来实现数组的打印
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }




    public static void fac3(int n){
        if(n <= 9){
            System.out.print(" "+ n);//终止条件就是个位数，直接打印
            return;
        }
        System.out.print(" "+ n % 10);//如1234，次数直接打印4
        fac3(n / 10);//开始递归，123
        //此处是逆序打印，按顺序只要递归和打印互换即可
    }
    public static void fac4(int n){
        if(n <= 9){
            System.out.print(" "+ n);//终止条件就是个位数，直接打印
            return;
        }

        fac3(n / 10);
        System.out.print(" "+ n % 10);//此处实现顺序打印
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fac3(n);
        System.out.println();
        fac4(n);
    }



    public static int fac2(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + fac2(n-1);
        return sum;
    }


    public static void main6(String[] args) {
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
    public static int fib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        int tmp = fib(n-1) + fib(n-2);
        return tmp;
    }

    public static void main20(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fib(n);

        System.out.println("斐波那契数列的第n项为：" + ret);
    }

    public static int add(int a, int b){
        return a+b;
    }


    public static double add(double x, double y, double z){
        return x+y+z;
    }

    public static void main21(String[] args) {

        int sum1 = add(1,2);
        double sum2 = add(1,2,3);
    }


        public static int fac5(int n){

            if(n <= 9){
                //终止条件就是个位数，直接打印
                return n;
            }
            return  (n % 10) + fac5(n / 10);
        }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = fac5(n);
        System.out.println(sum);
    }


    }