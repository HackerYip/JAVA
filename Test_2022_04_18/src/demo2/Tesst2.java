package demo2;

interface A{
    void funcA();
}
interface B{
    void funcB();
}

//代表C 拓展了A和B的功能，所以现在有ABC内三个功能，所以下面要重写3个
interface C extends  A,B{
    void funcC();
}
class AA implements C{


    @Override
    public void funcC() {
        System.out.println("fafa");
    }

    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}
public class Tesst2 {


}
