public class TestDemo {

     //泛型适用于许多许多类型
    //从代码上讲，就是对类型实现了参数化

    //目标：数组中可以存放任何类型的数据 -> 我们知道，Object是所有类的父类
    class MyArray<T>{//占位符，代表当前类是一个泛型类
        //这时候数组里面不能是Object
        public int[] array = new int[10];
        public Object[] array2 = new Object[10];
        public T[] array3 = (T[])new Object[10];//这个写法也不好

    }

    public Object getPos(int pos){
        return array2[pos];
    }
}
