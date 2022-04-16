

    //回顾
    //类和对象
    //1.定义一个类
    //2.使用类
    //3.实例成员变量和实力成员方法，怎么访问？对象的引用.xxx
    //4.静态的成员变量和静态的成员方法怎么访问？类名.xxx
    //5.构造方法
    //6.this
    //
    //面向对象
    //封装：在实现上采用private修饰成员变量和成员方法，这样在类外就不能直接访问了
    //对外隐藏实现的细节，只提供公开的方法，来操作你的这些封装好的成员变量和成员方法
    //公开的方法 和 私有的属性之间的结合
    //
    //继承
    //语法：A extends B
    //A：子类/派生类 B：父类/基类/超类
    //意义：可以达到代码的复用，对两个类进行 共性的提取
    //
    //有关这个访问 成员变量和成员方法的问题：
    //1.不管你的名字一样不一样，只要记得：这些东西到底是不是都是要用对象的引用来访问！！
    //2.优先访问子类的
    //
    //
    //
    //

    class A{
        int a = 100;
    }
    class B extends A{
        char a;
        public void func(){
            super.a = 97;
        }
    }
    public class TestDemo {
    public static void main(String[] args) {
        B b = new B();
        b.func();
        System.out.println(b.a);//就近原则
        A a = new A();
        System.out.println(a.a);
    }

}
