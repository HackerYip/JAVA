package demo6;

class Person implements Cloneable{
     public int id = 1234;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }


}


public class TestDemo {
    //1.这个对象是可以被克隆的
    //2.
    Person person1 = new Person();
    Person person2 = person1.cl

}
