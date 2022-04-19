package user;

public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
    }
    public void menu(){
        System.out.println("hello "+this.name+"欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
    }
}
