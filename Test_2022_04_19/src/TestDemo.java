
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
}


public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",18);
        Student student2 = new Student("zhangsan",18);//两个对象不一样，新的对象，所以直接比较会false，因为地址不一样


    }
}
