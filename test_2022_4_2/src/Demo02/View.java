package Demo02;

import java.util.Scanner;


//视图类，用来展示各种用户操作界面
public class View {

    Scanner scanner = new Scanner(System.in);

    Control control = new Control();

    int id = 1001;

    public void menu() {
        System.out.println("欢迎使用学生管理系统");
        System.out.println("1.增加学生姓名");
        System.out.println("2.删除学生姓名");
        System.out.println("3.查找学生姓名");
        System.out.println("4.修改学生姓名");
        System.out.println("0.退出");
        System.out.print("请选择你的操作：");
    }


    public void add(){
        System.out.print("请输入学生姓名：");
        String name = scanner.next();
        System.out.print("请输入学生年纪：");
        int age = scanner.nextInt();
        Student student = new Student(id,name,age);
        control.add(student);
        id++;
    }

    public void del(){
        System.out.println("编号\t\t姓名");
    }

    public void search(){
        Student[] students = control.search();
        System.out.println("学号\t\t姓名\t\t年龄");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.println(students[i].getId()+"\t\t"+students[i].getName()+"\t\t"+students[i].getAge());
            }
        }
    }

    public void change(){
        control.search();
    }

    public void start() {
        boolean loop = true;
        do{
            menu();
            int input = scanner.nextInt();
            switch(input){
                case 1:
                    add();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    change();
                    break;
                case 0:
                    System.out.println("退出系统");
                default:
                    System.out.println("请输入0~5之间的整数");
                    break;


            }


        }while(loop);
    }
}
