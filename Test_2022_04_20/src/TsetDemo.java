public class TsetDemo {


    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(0));

        int index = str.indexOf('h');//无论有多少个h，从头到位找到第一个字符h，返回下标，-1代表没有这个字符
        System.out.println(index);

        //indexof还重载了很多方法



        String str2 = "abcbdbcbda";
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf('a',4));//从fromIndex的位置开始从后往前找'a'



    }

}
