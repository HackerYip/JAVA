package com.bit.demo3;



class Test {
    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args){

        String s;

        System.out.println("s="+s);

    }


}
public class MyApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test test=null;
        test.hello();
    }
}

public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args）{
        System.out.println（“cnt =” + cnt);
    }
    static{
        cnt /=3;
    };
}

public class Person{

    private String name = "Person";

    int age=0;

}

public class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        System.out.println(p.name);

    }

}

public class HasStatic {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        HasStatic hsl = new HasStatic();// 4
        hsl.x++;// 5
        HasStatic hs2 = new HasStatic();// 6
        hs2.x++;// 7
        hsl = new HasStatic();// 8
        hsl.x++;// 9
        HasStatic.x--;// 10
        System.out.println(" x=" + x);// 11
    }


class Student{
    private String name;//没有强制规定什么时候用private或者public
    private int age;
    private double score;
    public static String classes;


    public void doClass(){
        System.out.println(this.name + "正在上课");
    }


    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                "班级 =" + classes+
                '}';
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("bit",18,34.6);
        Student student2 = new Student("张三",28,14.6);

        Student.classes = "104Java";
        System.out.println(Student.classes);//静态变量不需要实例化对象
        //student1.classes = "hhhhhh";//这个是反例，不建议这么写，这个classes是属于类变量，不属于某一个对象的
        //静态的成员变量和静态的成员方法，都不依赖于对象来调用，因为他们是类变量，通过类名来访问的
        //静态的成员方法当中，不能访问非静态的成员（包括成员变量和成员方法）。非静态的成员变量依赖对象
    }


    //代码块
    //1.实例代码块/构造代码块
    //2.静态代码块，只执行一次，不管实例化多少个对象，它也是执行一次
    //3.本地代码块/普通代码块，一般用不上
    //4.同步代码块，目前用不到

//1.实例代码块优先于构造方法执行。从字节码角度来看，是吧实例代码块当中的内容，拷贝到了构造方法之前

}
