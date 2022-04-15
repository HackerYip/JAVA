package com.bit.demo3;



class Student{
    private String name;//没有强制规定什么时候用private或者public
    private int age;
    private double score;
    private static String classes;


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
                '}';
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("bit",18,34.6);
        Student student2 = new Student("张三",28,14.6);

        System.out.println();
    }
}
