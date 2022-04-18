package demo6;

class Person implements Cloneable{
     public int id = 1234;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class TestDemo {
    //1.这个对象是可以被克隆的
    //2.
    Person person1 = new Person();
    Person person2 = person1.clone();//这里clone()的返回值是Object类的，是一个父类，把父类给了子类，要强转

    public TestDemo() throws CloneNotSupportedException {
    }
}
