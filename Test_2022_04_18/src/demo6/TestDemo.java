package demo6;

class Money implements Cloneable{
    public double money = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Person implements Cloneable{
     public int id = 1234;
     public Money m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person)super.clone();
        tmp.m  = (Money)this.m.clone();//强转
        return tmp;
        //return super.clone();
    }
}


public class TestDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        //1.这个对象是可以被克隆的
        //2.实现深拷贝 是代码层次上进行的 不是说某个方法是深拷贝，是从代码的实现上来看
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();//这里clone()的返回值是Object类的，是一个父类，把父类给了子类，要强转
        //System.out.println(person2);
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("=======================");

        person2.m.money = 99.99;//浅拷贝，会影响对象,

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

    }
}
