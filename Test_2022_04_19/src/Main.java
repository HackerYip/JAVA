import java.util.Scanner;

public class Main {

    public static void login(){
        System.out.println("请输入姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1->管理员， 0->普通用户");
    }


    public static void main(String[] args) {

        login();
    }
}
