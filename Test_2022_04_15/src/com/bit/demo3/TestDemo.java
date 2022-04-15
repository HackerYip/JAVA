package com.bit.demo3;



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
}
