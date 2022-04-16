package demo2;

import demo1.Test;

class Money{

}

class Student{
    private Money money;
}

class Teacher{
    private Money money;
}

class School{
    public Student[] students;
    public Teacher[] teachers;

}


public class TestDemo extends Test {

    public void func(){
        Test test = new Test();
        System.out.println(super.k);
    }
    public static void main(String[] args) {

    }

}
