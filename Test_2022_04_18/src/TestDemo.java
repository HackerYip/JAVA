import java.awt.*;

//1.使用abstract修饰的类，就是抽象类
//2.使用abstract修饰的方法，就是抽象方法
//3.抽象类 不能够进行实例化，不能new
//4.当一个普通的类，继承这个抽象类之后，那么这个普通类，必须重写这个类当中的所有抽象方法
//5.抽象类存在的最大的意义，就是为了被继承
//6.抽象类也可以发生向上转型，进一步多态
//7.当一个抽象类A 继承了抽象类B，此时抽象类A可以不重写抽象类B当中的方法
//8.当一个普通的类C继承了 第8条的A，此时就得重写所有的抽象方法
//9.final不能修饰抽象方法和抽象类
//10.抽象方法也不能private
//11.抽象类当中不一定有抽象方法，但是如果这个方法是抽象方法，那么这个类一定是抽象类





abstract class Shape{
    public abstract void draw();//抽象方法

   /* public void func(){
        System.out.println("fafa");
    }
}

abstract class A extends Shape{
    public abstract void func();
}

class B extends A{

    @Override
    public void draw() {

    }

    @Override
    public void func() {

    }*/
}
public class TestDemo {

    public static void main(String[] args) {
        //抽象类
        //Shape shape = new Shape();//不能实例化抽象类
    }
}
