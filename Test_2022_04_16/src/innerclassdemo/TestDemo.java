package innerclassdemo;


class OuterClass{
    public int data1 = 10;//实例成员变量（普通成员变量）
    private int data2 = 20;
    public static int data3 = 30;


    class InnerClass{
        //实例内部类
        //1.如何实例化内部类对象
        //外部类命.内部类名（这个时候才能拿到内部类的类型） 变量 = 外部类对象的引用.new InnerClass()

        //2.实例内部类当中不能定义静态的成员变量？ 但是要定义， 必须是编译的时候确定的值（必须是static final的）
        //public static final int data6 = 60;
        //常量 在编译的时候就确定了这个值是几了

        //3.实例内部类当中，如果有成员变量和外部类的成员变量重名了，怎么办？
        //优先使用自己的！
        //如何拿到外部类的呢？
        //OuterClass.this.对象
        //实例内部类当中，不仅包含了自己的this，而且包含了外部类的this

        public int data4 = 40;
        private int data5 = 50;

        //public static int data6 = 60;
        public static final int data6 = 60;

        public InnerClass(){
            System.out.println("InnerClass的构造方法");
        }
        public void method(){
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
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
