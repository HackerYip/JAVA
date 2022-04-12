import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.Arrays;

public class TestDemo {

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.

    public static void printArray(int[] array){
            System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
         printArray(array);
    }




    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] array) {
        double average = 0;
        int ret = 0;
        for( int i: array ){
            ret += i;//for循环增强遍历先求出一个总值
        }
        average = ret/array.length;//总值除以系数得出平均数，注意是double类型

        return average;
    }

    public static void main3(String[] args) {
        int[] array= {80,82,85,90,95,98};
        System.out.println(avg(array));
    }



    public static int sum(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k += array[i];
        }
        return k;
    }



    public static void main2(String[] args) {
        int k = 0;
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int ret = sum(array);
        System.out.println(ret);
    }


    //写一个函数， 数组以字符串的形式进行输出[1,2,3,4]

    public static String myToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if(i != array.length - 1){
                str += ",";
            }
        }
                str += ",";
                return str;
    }



    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        String ret = myToString(array);
        System.out.println(ret);
    }

}



