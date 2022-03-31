package com.demo;


import java.util.Scanner;

/*public class Test {
    *//*public static void main(String[] args) {
        //if   else if   else   switch case default    while   do-while    for   break   continue
        //扫描仪；用来接受用户在控制台的输入
        //1.声明扫描仪对象
        Scanner scanner = new Scanner(System.in);
        //2.给用户提示
        System.out.println("请输入第一个数据：");
        //3.接收用户的输入
        String str = scanner.next();
        //4.操作用户输入的数据
        System.out.println("请输入第二个数据：");
        String str01 = scanner.next();
        System.out.println("你输入的数据是：" + str+ str01);
    }
}*//*

  *//*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int a = scanner.nextInt();

        while (true) {   //boolean
            if ((a > 10) && (a != 0)) {
                System.out.println(a);
                break;
            } else {
                System.out.println("re-enter: ");
            }
        }
    }*//*
}*/


/*
public class Test{

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for(i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
*/


public class Test{

    //void : 无返回值的
    public static int is_Nar_number(int n){
        int hun = n / 100;//百位
        int ten = n / 10 % 10;
        int nid = n % 10;
        int count = 0;
        if((hun*hun*hun) + (ten*ten*ten)+(nid*nid*nid) == n ){
            count++;
            System.out.println("100到999的水仙花数一共有:" +count+"分别是:"+n);
            //System.out.println(n);

        }
        return count;

    }
    public static void main(String[] args) {
        int n = 0;
        for(n = 100; n < 1000; n++){
           is_Nar_number(n);
        }

    }

}

