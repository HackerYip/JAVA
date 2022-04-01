package com;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //声明对象
        MethodRun methodRun = new MethodRun();

        boolean loop = true;
        do {
            methodRun.menu();
//整数接收
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    switch(input){
        case 1:
            int a = 0;
            int b = 0;
            System.out.println(methodRun.add(a,b));

        case 2:
            methodRun.sub();
        case 3:
            methodRun.mul();
        case 4:
            methodRun.div();



    }













        }while(loop);
        }
    }




