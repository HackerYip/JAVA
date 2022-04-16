package demo1;

class Animal{
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Cat(){
        super();
    }
    public Cat(String name,int age,String hair){
        super(name,age);//显示调用父亲的构造方法，来初始化 子类从父类继承过来的东西
        this.hair = hair;
    }

    public void mew(){

        //System.out.println(this.name + "正在叫!");//父类的字段如果用private修饰的话，此处是不能访问了，并不是没有继承
        System.out.println(this.getName() + "正在叫!");
    }
}
public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("mimi",12,"black");
        cat1.setName("mimi");
        cat1.mew();
        cat1.eat();
    }
}
