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

class Student{
    public String name;
    public int age;
    public double score;
    public String sex;



    public void doClass(){
        System.out.println("上课");
    }
    public void doHomeWork(){
        System.out.println("写作业");
    }
}


class MyGirlFriend{
    public String name;
    public int age;

    public void eat(){
        System.out.println("吃火锅");
    }
}

public class TeatDemo3 {
    Person person = new Person();//实例化一个对象[通过new关键字来创建了一个对象]
    Person person2 = new Person();//通过new关键字可以
    Student student1 = new Student();//学生 对象/实体   上面的只是描述一个学生出来，并没有真正产生一个学生
    MyGirlFriend myGirlFriend = new MyGirlFriend();//实例化女朋友
}
