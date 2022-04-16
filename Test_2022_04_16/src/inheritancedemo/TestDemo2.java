package inheritancedemo;

class Base{
    public int a = 1;
    public int b = 2;

}

class Derived extends Base{
    public int c = 3;
    public int d = 4;

    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class TestDemo2 {

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
