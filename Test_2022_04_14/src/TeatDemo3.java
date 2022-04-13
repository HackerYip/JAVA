import java.util.Arrays;

//Person 类名 - 大驼峰
//一个类由两部分组成
class Person{
    //1.属性[成员变量]:定义在类当中  方法的外边的
    public String name;
    public int age;



    //2.方法[成员方法]
    public void sleep(){
        System.out.println("睡觉! ");
    }

    public void eat(){
        System.out.println("吃饭! ");
    }

}


public class TeatDemo3 {
    Person person = new Person();
    Person person2 = new Person();


}
