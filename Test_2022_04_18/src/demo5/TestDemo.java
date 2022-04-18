package demo5;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}


class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);//年龄比较器
    }
}
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}


public class TestDemo {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",19);
        students[1] = new Student("lisi",8);
        students[2] = new Student("abc",78);

        AgeComparator ageComparator = new AgeComparator();
        NameComparator nameComparator = new NameComparator();
        System.out.println("排序前：" + Arrays.toString(students));

//        Arrays.sort(students,ageComparator);
        Arrays.sort(students,nameComparator);

        System.out.println("排序后：" + Arrays.toString(students));
    }

    public static void main2(String[] args) {
        Student students1 = new Student("zhangsan",19);
        Student students2 = new Student("abc",78);
    }

    public static void main1(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",19);
        students[1] = new Student("lisi",8);
        students[2] = new Student("abc",78);
        System.out.println("排序前：" + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("排序后：" + Arrays.toString(students));
        System.out.println(Arrays.toString(students));
    }
}
