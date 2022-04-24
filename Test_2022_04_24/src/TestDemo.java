public class TestDemo {

//     //泛型适用于许多许多类型
//    //从代码上讲，就是对类型实现了参数化
//
//    //目标：数组中可以存放任何类型的数据 -> 我们知道，Object是所有类的父类
//    class MyArray<T>{//占位符，代表当前类是一个泛型类
//        //这时候数组里面不能是Object
//        public int[] array = new int[10];
//        public Object[] array2 = new Object[10];
//        public T[] array3 = (T[])new Object[10];//这个写法也不好
//
//    }
//
//    public T getPos(int pos){
//        return array2[pos];
//    }
//

    public class MyArraylist{
        public int[] elem;
        public int usedSize;

        public MyArraylist(){
            this.elem = new int[10];
        }

        //打印顺序表
        public void display(){

        }

        //新增元素,默认在数组最后新增
        public void add(int data){

        }

        //在 pos 位置新增元素
        public void add(int pos, int data){

        }
    }
}
