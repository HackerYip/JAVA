class B{
    public B(){
        func();
    }

    public void func(){
        System.out.println("B.func()");
    }
}

class D extends B{
    D(){
        super();
    }
   public void func(){
       System.out.println("D.func()");
    }
}


public class Test {
    public static void main(String[] args) {
        D d = new D();
    }
}
