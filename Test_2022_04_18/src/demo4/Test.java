package demo4;

import java.util.Arrays;

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

public class Test {

    public static void main(String[] args) {
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
