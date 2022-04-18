package demo2;

class Animal{
    public String name;
    public int age;

public Animal(String name){
    this.name = name;//构造方法
}

    public void eat(){
        System.out.println(this.name + "吃饭饭！");
    }
}
// 飞 跑 游泳 不能都写在这

interface IFlying{
    void fly();
}

interface IRunning{
    void run();
}

interface ISwimming{
    void swim();
}

class Cat extends Animal implements IRunning{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+ "正在跑");
    }
}

class Dog extends Animal implements IRunning,ISwimming{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑！");
    }

    @Override
    public void swim() {
        System.out.println(this.name+ "正在游泳！");
    }
}

//class Robot extends

public class Test {


    public static void walk(IRunning iRunning){
        iRunning.run();
    }

//    public static void main(String[] args) {
//        walk();
//    }



    public static void main1(String[] args) {
        Animal animal = new Cat("miim");
        Animal animal1 = new Dog("mimi2");


        IRunning iRunning = new Dog("mimi2");
        IRunning iRunning1 = new Cat("mimi");
        ISwimming iSwimming = new Dog("mimi2");
    }
}
