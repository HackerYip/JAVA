package demo01;

//实体类，描述某一类事物的特征
public class People {
    private long id;
    private String name;
    private int age;


    //getter   setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }




    public void eat(){
        System.out.println("吃饭方法");
    }

    //默认会自动添加
    public People(){

    }

    public People(long id,String name,int age){
        //this指向当前类的实力对象
        this.id = id;
        this.name = name;
        this.age = age;
    }
    /*public People(long a,String b, int c){
        id = a;
        name = b;
        age = c;
    }*/



    public int  add(int a , int b){
        return a + b;
    }

    public int add(int x,int y,int z){
        return x*y*z;
    }
}

