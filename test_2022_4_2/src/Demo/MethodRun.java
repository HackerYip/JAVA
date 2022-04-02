package Demo;

public class MethodRun {


    public void menu() {
        System.out.println("calculator");
        System.out.println("please enter an integers");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("0.exit");

    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int mul(int i, int j) {
        return i * j;
    }

    public int div(int q, int t) {
        return q / t;
    }
}