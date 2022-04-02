package demo01;

public class Test {
    public static void main(String[] args) {
        //面向对象的三大特性：封装，继承，多态      抽象
        //封装的作用：保护数据的安全
        //封装的定义：不让外部类直接访问当前类的属性，但是可以通过我们留下的方法访问


        //构造函数：用来实例化对象，快速对属性赋值
        People people = new People(1,"",23);
        people.setName("jack");
        System.out.println(people.getName());
        people.add(1,2,3);

        //成员变量，也就是属性有默认值，而局部变量也就是方法里面的变量，没有默认值

        //重载：根据不同的参数列表，执行相同方法名的不同方法
        //跟访问修饰符，返回只类型无关，跟方法名，参数列表有关
        people.add(1,2,3);

        //对象数组：用数组来保存对象

        int a = 10;
        //数组类型【】  数组名 =  new 数据类型【数组长度】；
        int[] ints = new int[10];
        ints[0] = a;
        ints[1] = 11;

        //对象数组
        People[] peoples = new People[10];
        peoples[0] = people;
        peoples[1] = new People(1,"tom",18);

    }
}
