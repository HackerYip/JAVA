package Demo;

/*
public class Test {

*/
/*    *//*
*/
/*String [] str = new String [10];*//*
*/
/*

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5 - i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();//
        }
    }


//第二种方法
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");//换行
        }

    }*//*



    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
             for(int j = 0;j < i; j++){
                System.out.print(" ");
            }

             for(int j = 0;j < 2*(5-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        for(int i = 0; i)



    }





}
*/


/*import java.util.Arrays;

public class Test{


    public static void main(String[] args){


        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j = 3;

        for(int i=0, k=0; i<arr.length; i++){
            if(i != j){
                arr_new [k] = arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }
}*/

/*import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'p', 'u', 'z'};


        //char chars2[] = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

        System.out.println("请输入要插入的字符:");
        Scanner sc = new Scanner(System.in);

        int index = chars.length - 1;

        char ch = sc.next().charAt(0);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > ch) {
                //记录下标
                index = i;
                //结束循环
                break;
            }
        }

        char chars2[] = new char[chars.length + 1];
        for(int i = 0; i < index; i++){
            chars2[i] = chars[i];
        }

        chars2[index] = ch;

        //从标记点开始到末尾遍历

        for(int i = index; i < chars.length; i++){
            chars2[i + 1] = chars[i];
        }

        chars = chars2;

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }


    }
}*/

import java.util.Scanner;




public class Test {

    public static void reverse(){


    }
    public static void main(String[] args) {
        char arr[] = new char[]{'a','c','u','b','e','p','f','z'};


    }
}
