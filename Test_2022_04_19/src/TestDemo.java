import java.util.Objects;

class Student{
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //暂且理解为判断类型
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",18);
        Student student2 = new Student("zhangsan",18);//两个对象不一样，新的对象，所以直接比较会false，因为地址不一样

        System.out.println(student1.equals(student2));//也不能,

    }
}
