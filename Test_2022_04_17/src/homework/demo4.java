package homework;

class Base{

    public Base(String s){

        System.out.print("B");

    }

    public Base(){

    }
}

class Derived extends Base{

    public Derived(){
        super();
    }

    public Derived (String s) {
        super(s);

        System.out.print("D");

    }



}

public class demo4 {
    public static void main(String[] args){

        new Derived("C");

    }

}
