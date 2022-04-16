package innerclassdemo;




class OuterClass2{
    public int data1 = 10;
    private int data2 = 20;
    public static int data3 = 30;


    public void method(){
        System.out.println("OuterClass2::method()");
    }


    //静态内部类当中的一些问题
    //1.如何实例化静态内部类
    //OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
    //2.在静态内部类，只能访问外部类的静态成员
    //如果要访问外部类的非静态成员，怎么访问?
    //提供外部类对象


    static class InnerClass{
        public int data4 = 40;
        private int data5 = 50;
        public static int data6 = 60;


        OuterClass2 out;//null 未初始化
        InnerClass(){
            System.out.println("InnerClass()");
        }

        InnerClass(OuterClass2 out){
            this.out = out;
            System.out.println("InnerClass");
        }

        public void method(){
            System.out.println("innerclass的method方法！");
            System.out.println(out.data1);
            System.out.println(out.data2);
            System.out.println(out.data3);
            System.out.println(data4);

        }
    }
}

public class TestDemo2 {

    public static void main3(String[] args) {
        //不需要外部类对象，所以，静态内部类使用的频率会比较高，看场景
        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();//等号右边用外部类类名.即可，因为这是静态的
        innerClass.method();
    }
}







