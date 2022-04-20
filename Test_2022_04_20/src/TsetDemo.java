import java.util.Arrays;
import java.util.Locale;

public class TsetDemo {

    public static void main(String[] args) {
        String str = "abcabcbcaabcabc";
        String str2 = str.replace('a','m');
        //记住所有的替换，java里面所有对字符串的操作都会产生新的对象，所以这里并不会在原来这个str字符串里面把字符修改了
        //而是重新生成了个对象，在这个新的对象里面把字符修改了，原来的不变
        //因为字符产是常量，不可变的
        //以下可以打印证实一下
        System.out.println(str);
        System.out.println(str2);

    }


    public static void main5(String[] args) {
        //以格式化的形式 转变为字符串

        String s = String.format("%d-%d-%d",2019,9 ,14);
        System.out.println(s);
    }

    public static void main4(String[] args) {
        String s = "hello";
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
    }



    public static void main3(String[] args) {
        String s = "hello";
        String s2 = s.toUpperCase();
        System.out.println(s2);//引用新对象

        //小写Lower
    }



    public static void main2(String[] args) {
        int a = 10;
        String str = String.valueOf(a);
        System.out.println(str);//就会把10变成字符串10


        String str2 = "1234";
        int ret = Integer.valueOf(str2);
        int ret2 = Integer.parseInt(str2);

        System.out.println(ret+1);
        System.out.println(ret2+1);
    }



    public static void main1(String[] args) {
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
