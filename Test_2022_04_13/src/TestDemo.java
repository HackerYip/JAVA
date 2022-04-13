import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {


    public static void main12(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};

        int[][] array2 = new int[2][];//可以省略列

        array2[0] = new int[2];
        array2[1] = new int[4];
        //上面两种叫做不规则数组，可以任意指定一行有多少列
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main4(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("使用foreach来进行打印");
        for(int[] tmp : array){//冒号左边是元素类型，冒号右边是数组名字
            for(int x : tmp){
                System.out.println(x + " ");
            }
            System.out.println();
        }
        System.out.println("使用toString方法进行打印：");
        System.out.println(Arrays.toString(array));//打印地址
        System.out.println(Arrays.deepToString(array));
    }


    public static void main3(String[] args) {

        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};

        int[][] array3 = new int[2][3];

    }


//public static int binarySearch(int[] array, int key){
//        int left = 0;
//        int right = array.length - 1;
//        while(left <= right){//以下是一趟二分查找，所以要循环
//            int mid = (left + right) / 2;
//            if(array[mid] < key){
//                left = mid + 1;
//            }
//            else if(array[mid] == key){
//                return mid;
//            }
//            else{
//                right = mid - 1;
//            }
//        }
//        //走到这里，left > right
//        return -1;//负数即可，数组没有负数下标
//}
//
//
//    public static void main1(String[] args) {
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        int key = 7;
//        int index =  binarySearch(array, key);//创建一个变量接收 方法返回来的下标
//        if(index == -1){
//            System.out.println("没有你要找的关键字~ ");
//        }
//        else{
//            System.out.println("找到了，下标是: " + index);
//        }
//
//    }


    public static int binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length -1;
        while(left <= right){
            int mid = (left + right) / 2;//要写在循环内，每趟2份查找重新定义中间位置
            if(array[mid] < key){
                left = mid +1;
            }
            else if(array[mid] == key){
                return mid;//找到了就返回下标
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }




    public static void main34(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        int index = binarySearch(array,key);
        if(index == -1){
            System.out.println("找不到");
        }
        else{
            System.out.println("找到了" + index);
        }

    }



    public static void Jud(int[] array){
            boolean ret = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]>array[i+1]){
                    ret = true;
                }
            }
            if(ret == false){
                System.out.println("此数组有序");
            }else{
                System.out.println("此数组无序");
            }
        }



    public static void main36(String[] args) {
        //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println("请输入");
        int[] array = {2,4,1,5,8,10};

        Jud(array);
    }


    public static int singleNumber(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++){

            num ^= array[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,4,3,2,5};
        System.out.println(singleNumber(array));
    }
}




