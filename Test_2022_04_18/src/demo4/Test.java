package demo4;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
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


    @Override
    public int compareTo(Student o) {
        /*if(this.age > o.age){
        //            return 1;
        //        }
        //        else if(this.age == o.age){
        //            return 0;
        //        }
        //        else{
        //            return -1;
        //        }
        //        //return 0;*/
                return this.age - o.age;//从小到大，大到小反过来即可
                //return(int)(this.score-o.score);
    }
}



class Student2{
    public String name;
    public int age;
    public double score;

    public Student2(String name, int age, double score) {
        this.name = name;
        this.age = age;
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

/*    //比较器
    class AgeComparator implements Comparable<Student>, Comparator<T> {

        @Override
        public int compareTo(Student o1,Student o2) {
            return o1.age-o2.age;
        }
    }


class StringComparator implements Comparable<Student>{

    @Override
    public int compareTo(Student o1,Student o2) {
        return o1.name.compareTo(o2.name);
    }*/
}

public class Test {

/*
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",18,78.9);
        students[1] = new Student("lisi",38,18.9);
        students[2] = new Student("abc",78,88.9);

        AgeComparator ageComparator = new AgeComparator();

        Arrays.sort(students,ageComparator);//可以传第二个参数，比较器，决定排序类型

        StringComparator StringComparator = new StringComparator();

        Arrays.sort(students,StringComparator);

        System.out.println(Arrays.toString(students));
    }*/
//}

    public static void main1(String[] args) {
        Student student1 = new Student("zhangsan",18,78.9);

        Student student2 = new Student("lisi",38,18.9);
//student1 和 student2比较
        System.out.println(student1.compareTo(student2));

        //java里面不支持 这样的大于和小于号比较
        //if(student1.compareTo(student2) > 0){
        // }
    }

    public static void main2(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",18,78.9);
        students[1] = new Student("lisi",38,18.9);
        students[2] = new Student("abc",78,88.9);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
