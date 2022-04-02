package Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //声明对象
        MethodRun methodRun = new MethodRun();

        boolean loop = true;
        do {
            methodRun.menu();
//整数接收
            Scanner scanner = new Scanner(System.in);

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("请输入第一个整数");
                    int a = scanner.nextInt();
                    System.out.println("请输入第二个整数");
                    int b = scanner.nextInt();
                   /* int a = 0;
                    int b = 0;*/
                    System.out.println(methodRun.add(a, b));
                    break;
                case 2:
                    System.out.println("请输入第一个整数");
                    int x = scanner.nextInt();
                    System.out.println("请输入第二个整数");
                    int y = scanner.nextInt();
                    methodRun.sub(x,y);
                    System.out.println(methodRun.sub(x,y));
                    break;
                case 3:
                    System.out.println("请输入第一个整数");
                    int i = scanner.nextInt();
                    System.out.println("请输入第二个整数");
                    int j = scanner.nextInt();
                    methodRun.mul(i,j);
                    System.out.println(methodRun.mul(i,j));
                    break;
                case 4:
                    System.out.println("请输入第一个整数");
                    int q = scanner.nextInt();
                    System.out.println("请输入第二个整数");
                    int t = scanner.nextInt();
                    methodRun.div(q,t);
                    System.out.println(methodRun.div(q,t));
                    break;
                case 0:
                    System.out.println("退出系统");
                    loop = false;
                    break;
                default:
                    System.out.println("请输入1到4的数");
                    break;
            }
        } while (loop);
    }
}