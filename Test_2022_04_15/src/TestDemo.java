
class Person{
    private String name;
    private int age;

    //私有的
    //public 访问修饰限定符
    //被修饰的 只是在访问 权限上不同
    // 类外别人拿不到成员变量 还有成员方法


    private void sleep(){
        System.out.println("睡觉");
    }


    public void eat(){
        this.sleep();//所以此处可以提供一个公开接口来访问private方法
    }


    public void setName(String name){
        this.name =  name;
    }
}







public class TestDemo {
    // 封装
    public static void main(String[] args) {
        Person person = new Person();
       // person.name;
        person.setName("关羽");//所以区别于上一行代码，通过公开接口访问成员变量name
    }

}
