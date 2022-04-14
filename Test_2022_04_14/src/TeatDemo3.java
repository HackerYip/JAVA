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
    //当程序当中 没有构造方法的时候，编译器会帮我们 默认提供一个不带参数的构造方法
    //如果你写上了构造方法，编译器就不会再帮你 默认提供一个不带参数的构造方法




    //1.构造方法 是没有返回值的方法，方法名和类名是一样的
    //2. 构造方法 不至一个，可以有多个，多个构造方法之间，构成了重载
    //3.当我们写了一个类后，没有写构造方法的时候，编译器会帮我们默认生成一个不带参数的构造方法
    //4.当我们写了一个构造方法之后，编译器你不再为我们，提供不带参数的构造方法
    //5.一个类 至少会有1个构造方法就算你没写！
    //6.构造方法 本质就是实例化对象的时候调用 1、分配内存 2、调用合适的构造方法
    //7.this可以用来调用本类中 其他的构造方法[构造方法当中使用]。 必须放到第一行！ 所以只能在当前构造方法当中，调用一个
    //8.this的用法 ①this.date 访问属性 ②this.func(); 访问方法 ③ this(); 调用本类中其他的构造方法
    //9.this不能形成 环



public Student(){
    System.out.println("这个是不带参数的构造方法");
}

    public Student(String name,int age){
        System.out.println("这个是不带参数的构造方法");
        this.name = name;
        this.age = age;
    }//重载了

    public Student(String name, int age, double score, String sex) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.sex = sex;
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
