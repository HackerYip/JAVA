import java.util.Arrays;

//Person 类名 - 大驼峰
//一个类由两部分组成
class Person{
    //1.属性[成员变量][字段][filed]:定义在类当中  方法的外边的
    public String name;
    public int age;



    //2.方法[成员方法][method]
    public void sleep(){
        System.out.println("睡觉! ");
    }

    public void eat(){
        System.out.println("吃饭! ");
    }
}




class MyGirlFriend{
    public String name;
    public int age;

    public void eat(){
        System.out.println("吃火锅");
    }
}


class Student{
    public String name;
    public int age;
    public double score;
    public String sex;

//    public String name = "bit";
//    public int age = 10;
//    public double score;
//    public String sex;
//    写死了，叫就地初始化




//构造方法非常特殊
    //1.方法名必须和类名是一样的
    //2.没有返回值

    //构造方法用来干嘛呢：
    //当我们实例化一个对象的时候：
    //  1.为对象分配内存
    //  2.调用合适的构造方法
    //必须会有这两步，但不一定只有这两步
    //构造方法可以有多个

public Student(){
    System.out.println("这个是不带参数的构造方法");
}


    public void doClass(){
        System.out.println(name + "正在上课");
    }
    public void doHomeWork(){
        System.out.println(name + "写作业");
    }

    public void show(){
        System.out.println("姓名 "+ name + "年龄 "+ age + "学分 "+ score + "性别 " + sex);
    }

}


public class TeatDemo3 {//重构的时候，要用工具重构，并且如果一个java文件内存在多个类的话，重构会报 错


    public static void main1(String[] args) {

        //只要实例化一个对象，那么就会在堆上给对象开辟一块内存
        //当成员变量没有赋初值的时候，每个成员变量都是他所对应的0值
        //引用类型对应的是null
        //boolean对应的是false
        //char -> "\u0000" -> 代表的是unicode编码的一个空格

        //类名   变量  = new  类名()          实例化对象/创建一个对象
        Person person = new Person();//实例化一个对象[通过new关键字来创建了一个对象]
        Person person2 = new Person();//通过new关键字可以
        Student student = new Student();//学生 对象/实体   上面的只是描述一个学生出来，并没有真正产生一个学生
        MyGirlFriend myGirlFriend = new MyGirlFriend();//实例化女朋友

        student.age = 10;//通过student这个引用对象使用点号 引用/指向/访问到堆上的name age sex
        student.name = "bit";
        student.score = 10.9;
        student.sex = "男";
        student.doClass();
        student.doHomeWork();
        student.show();
        System.out.println("==========================");

        Student student2 = new Student();
        student2.name = "bolin";
        student2.age = 23;
        student2.score = 100;
        student2.sex = "男";
        student2.doClass();
        student2.doHomeWork();
        student2.show();
    }
}
