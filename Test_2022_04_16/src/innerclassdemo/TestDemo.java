package innerclassdemo;


class OuterClass{
    public int data1 = 10;//实例成员变量（普通成员变量）
    private int data2 = 20;
    public static int data3 = 30;


    class InnerClass{
        //实例内部类
        //如何实例化内部类对象
        public int data4 = 40;
        private int data5 = 50;
        //public static int data6 = 60;

        public InnerClass(){
            System.out.println("InnerClass的构造方法");
        }
        public void method(){
            System.out.println("InnerClass的一个method方法! ");
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {

        //内部类：一个类的内部，定义的类叫做内部类
        //1.实例内部类
        //2.静态内部类
        //3.匿名内部类
        //不同的内部类所代表的性质，使用方式都是有区别的，以后说内部类需要带上前置

        //InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        //外部类命.内部类名（这个时候才能拿到内部类的类型） 变量 = 外部类对象的引用.new InnerClass()
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();//和上面一样
        //new OuterClass() 匿名对象：一般使用在只用1次的时候

    }
}
