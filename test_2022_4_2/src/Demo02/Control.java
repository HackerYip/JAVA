package Demo02;


import java.util.Scanner;

//控制类：所有的具体操作在这里完成
public class Control {
    //对象数组，是用来保存数据的
    Student[] students = new Student[10];

    Scanner scanner = new Scanner(System.in);

    public void add(Student student) {//
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
    public Student[] search(){
        return students;
    }


    public void del(Student student) {
        search();
        System.out.print("请输入要删除学生姓名对应的编号：");
        int num = scanner.nextInt();
        //names[num - 1] = null;
        for (int i = num; i < students.length; i++) {//这里的int是下标
            // if(names[num-1] == null){
            students[i - 1] = students[i];

            if (i == students.length) {
                students[i] = null;
            }
        }
    }

    public void change(Student student){

                System.out.print("请输入要改掉学生姓名的对应编号：");
                int num = scanner.nextInt();
                System.out.print("请输入要改掉前学生姓名：");
//       接受用户输入的字符串数据
                String name = scanner.next();


                /*students[num - 1] = (student);
                System.out.println("修改成功");
*/
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId() == student.getId()) {
                students[i] = student;
                break;
            }
        }
    }

}
