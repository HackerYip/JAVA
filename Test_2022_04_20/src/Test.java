import java.util.Scanner;

public class Test {

//    public static void main(String[] args) {
//        String str = "hello";
//        str += "world";//会产生一个StringBuilder的对象
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.append("world");//会产生很多临时对象
//        str = sb.toString();
//        System.out.println(str);//全新的对象
//    }

//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        //先对引用判断
//        if(str == null || str.length() == 0){
//            return -1;
//        }
//
//        for(int i = 0; i < str.length(); i++){
//            for(int j =0; j < str.length(); j++){
//                if(str.charAt(i) == str.charAt(j)){
//
//                }
//            }
//        }
//    }



//    public static String func(String str) {
//        if(str == null || str.length() == 0){
//            return -1;
//        }
//        int[] array = new int[127];
//        for (int i = 0; i < ; i++) {
//            char ch = str.length()
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
////循环输入-》处理的是多组输入
//        while(scan.hasNextLine()) {
//            String str = scan.nextLine();
//            String ret = func(str);
//            System.out.println(ret);
//        }
//    }

    public class Solution {
        public void merge(int A[], int m, int B[], int n) {
            int j = n -1;
            //index是数组A和B长度之和，因为题目规定A的长度一定能容纳B，所以直接相加作为合并后的坐标。
            int k = m + n - 1;
            int i = m -1;
            while(i >=0 && j >=0){
                A[k--] = A[i] > B[j] ? A[i--] : B[j--];
            }
            //如果A的数字比B多，则不会进入后续处理；如果B的数字比A多，则进入后续处理，将B剩余数字添加到数组A中。
            while(j >=0){
                A[k--] = B[j--];
            }
        }
    }
}
