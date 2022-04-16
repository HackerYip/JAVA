package demo1;

class Animal{//如果前面加上final，即为不能继承，同样可以用在变量和方法上
    protected String name;//protect 1.同一个包同一个类可以访问  2.同一个包不同类也可以访问
    private int age;

    static{
        System.out.println("Animal的静态代码块！");
    }

    {
        System.out.println("Animal的实例代码块！");
    }

    public Animal(){
        System.out.println("Animal不带参数的构造方法");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal带2个参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+ "正在吃饭");
    }

}


class Cat extends Animal{//上面写了构造方法初始化的话，这里会报错
    //所以，当子类继承父类后 一定要先创建父类，再创建子类
    //当构造子类的时候，一定要先帮助父类进行构造

    public String hair;

    static{
        System.out.println("Cat的静态代码块！");
    }

    {
        System.out.println("Cat的实例代码块！");
    }

    public Cat(){
        super();
        System.out.println("Cat不带参数的构造方法");
    }
    public Cat(String name,int age,String hair){
        super(name,age);//显示调用父亲的构造方法，来初始化 子类从父类继承过来的东西
        this.hair = hair;
        System.out.println("Cat带3个参数的构造方法");
    }

    public void mew(){

        //System.out.println(this.name + "正在叫!");//父类的字段如果用private修饰的话，此处是不能访问了，并不是没有继承
        System.out.println(this.getName() + "正在叫!");
    }
}
public class Test {

    protected int k = 99;

    public static void main(String[] args) {
        Cat cat1 = new Cat("mimi",12,"black");//同样是遵循1.静态 2.实例 3.构造

        System.out.println("=================================");

        Cat cat2 = new Cat("mimi",12,"black");//这次的输出结果就不一样了，因为静态只执行一次

    }


    public static void main11(String[] args) {
        Cat cat1 = new Cat("mimi",12,"black");
        cat1.setName("mimi");
        cat1.mew();
        cat1.eat();
    }
}
