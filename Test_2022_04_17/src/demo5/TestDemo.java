package demo5;


//多态
//思想:通过一个引用调用一个方法，此时因为这个引用 引用的对象不一样，会表现出不同的行为。
//1.向上转型[父类引用 引用子类对象]
//2.此时的子类和父类要有同名的覆盖方法
//3.通过这个引用 来调用这个重写的方法
//
//
//
//
//
//
//

class Shape{
    //省略了属性
    public void draw(){
        System.out.println("画图形！");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}



public class TestDemo {
public static void drawMap(Shape shape){
    shape.draw();
}




public static void drawShapes(){
    Rect rect = new Rect();
    Cycle cycle = new Cycle();
    Flower flower = new Flower();
    Shape[] shapes = {cycle,rect,cycle,rect,flower};
    for(Shape shape : shapes){
        shape.draw();
    }

    /*Shape[] shapes = new Shape[5];
    shapes[0] = new Cycle();
    shapes[1] = new Rect();*/
}

    public static void main2(String[] args) {
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Triangle triangle = new Triangle();

        drawMap(cycle);
        drawMap(rect);
        drawMap(triangle);
    }






    public static void main1(String[] args) {
        Shape shape = new Cycle();
        shape.draw();
    }
}
