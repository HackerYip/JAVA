package demo3;

    //多态
    //语文的角度：一种事物，多种形态（这种说法不算对，也不算错）
    //程序的角度：具体点就是去完成某个行为，当不同的对象去完成时会产生不同的状态
    //1.向上转型 ①直接赋值 ②方法的参数 ③方法的返回值
    //
    //2.方法重写
    //3.多态
    //
    //
    //
    //
    //
    //
    //
    //
    //


class Animal{
    public String name;
    public int age;


    public void eat(){
        System.out.println(this.name + "吃饭!");
    }
}

class Cat extends Animal{
    public String hair;


    public void eat() {
        System.out.println(this.name + "吃猫粮！");
    }

    public void mew(){
        System.out.println(this.name + "正在叫");
    }
}


public class TestDemo {

    public static void func(Animal animal){

    }

    public static Animal func2(){
        //return new Animal();
        return new Cat();//向上转型的第三种方式
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        func(cat);//也发生了向上转型
    }

    public static void main2(String[] args) {
       /* Cat cat = new Cat();
        Animal animal = cat;*/

        Animal animal = new Cat();//这就是向上转型
        animal.name = "mimi";
        animal.eat();//为什么调用子类的？？实际上编译的时候，这里还是Animal的eat()
        //animal.mew();//只能点到eat()，只能访问父类自己的特有的成员
    }


    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.mew();

        Animal animal = new Animal();
        //animal.mew();//这里通过父类引用 只能访问父类自己特有的方法
        animal.eat();//这里通过父类引用 只能访问父类自己特有的方法
    }
}
