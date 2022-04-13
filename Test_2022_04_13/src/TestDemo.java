import java.util.Arrays;

public class TestDemo {


    public static void main(String[] args) {
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


public static int binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){//以下是一趟二分查找，所以要循环
            int mid = (left + right) / 2;
            if(array[mid] < key){
                left = mid + 1;
            }
            else if(array[mid] == key){
                return mid;
            }
            else{
                right = mid - 1;
            }
        }
        //走到这里，left > right
        return -1;//负数即可，数组没有负数下标
}


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        int index =  binarySearch(array, key);//创建一个变量接收 方法返回来的下标
        if(index == -1){
            System.out.println("没有你要找的关键字~ ");
        }
        else{
            System.out.println("找到了，下标是: " + index);
        }

    }
}




