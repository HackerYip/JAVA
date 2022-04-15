import java.util.Arrays;
import java.util.Date;

class Person{
    private String name;
    private int age;

    //私有的
    //public 访问修饰限定符
    //被修饰的 只是在访问 权限上不同
    // 类外别人拿不到成员变量 还有成员方法

    //封装: 对类的实现的细节进行隐藏，对外只提供公开的方法来供你使用。提高了对数据的安全性

    String sex;//默认的:包访问权限(什么也没加在前面)
    //什么是包？
    //为了更好的管理类，把多个类收集在一起成为一组，称为软件包

    //import java.util.Arrays;
    //相当于C的include
    //import java.util.*;还可以这样，表示导入util包内所有，但是只有使用对应的时候才会加载对应的源码


    private void sleep(){
        System.out.println("睡觉");
    }


    public void eat(){
        this.sleep();//所以此处可以提供一个公开接口来访问private方法
    }


    public void setName(String name){
        this.name =  name;
    }
}







public class TestDemo {
    // 封装

    public static void main(String[] args) {

        double result = Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
        System.out.println(result);
    }


    public static void main3(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
        java.util.Date date = new java.util.Date();//指定导包，可以避免两个不同的包有同样的date
        //或者 Date date = new Date;//不指定导包
        System.out.println(date.getTime());

    }




    public static void main2(String[] args) {
        Person person = new Person();
       // person.name;
        person.setName("关羽");//所以区别于上一行代码，通过公开接口访问成员变量name
        person.eat();
    }

}
