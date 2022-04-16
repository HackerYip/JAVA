package inheritancedemo;

    class Base2{
        public int a = 1;
        public int b = 2;

        public void method(){
            System.out.println("BASE::TEST()");
        }
    }

    class Derived2 extends Base2{
        public int a = 3;
        public int d = 4;

        public void method(int a){
            System.out.println("Derived::method()" + a);
        }

        public void test(){
            /*method();//子类找不到，同样去父类找，找不到就报错
            method2();*/

            method();
            method(10);//重载
            System.out.println(a);//如果重名了，优先访问子类自己的
            System.out.println(super.a);//想要访问父类，就用super，写代码的时候 让这个更易读
            System.out.println(this.b);//super也可以，this也可以，但是this是abcd整体，所以重名的时候用super来区分拿出父类
            System.out.println(d);

            //super代表父类对象的引用，这句话不准确，因为只是子类在堆上开辟内存的时候，拿继承的初始化了一下父类而已，根本没有new父类对象
            //super其实就是一个普通的关键字，让别人或者程序员自己能够知道或者易读
        }
    }

    public class TestDemo3 {

        public static void main(String[] args) {
           Derived2 derived2 = new Derived2();
            derived2.test();
        }
    }


