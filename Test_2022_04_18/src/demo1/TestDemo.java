package demo1;

//1.接口使用关键字interface来修饰
//2.接口当中的成员方法，只能是抽象方法。所有的方法默认都是public abstract
//3.接口当中的成员变量，默认是public static final
//4.接口当中的方法，如果要实现，需要用default来修饰
//5.接口当中的静态方法，可以有具体实现
//6.不能new接口，接口不能实例化，只能被继承
//7.一个普通的类 可以通过implements来实现这个接口
//8.一个类，可以继承抽象类，同时实现多个接口。每个接口之间使用逗号来分割
//9.类和接口之间是imples，接口和接口之间的关系的extends



interface IShape{
    //成员变量
    //public int a;

    public static final int a = 10;//默认是一个静态常量，必须初始化

    //成员方法
    public abstract void func();

    default void func2(){
        System.out.println("默认的方法！");
    }

    public static void staticFunc(){
        System.out.println("静态方法");
    }

    void draw();
}


class A implements IShape{

    @Override
    public void func() {

    }

    @Override
    public void func2() {
        IShape.super.func2();
    }

    @Override
    public void draw() {
        System.out.println("fafa");
    }
}


public class TestDemo {

    public static void main(String[] args) {
        IShape ishape = new A();
        ishape.draw();
        ishape.func2();

        IShape.staticFunc();

    }
}
