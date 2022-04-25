import java.util.Arrays;

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

    public class MyArraylist {
        public int[] elem;
        public int usedSize;

        public MyArraylist() {
            this.elem = new int[10];
        }

        //打印顺序表
        public void display() {
            //usedSize==0;
            for (int i = 0; i < this.usedSize; i++) {
                System.out.println(this.elem[i] + " ");
            }
            System.out.println();
        }

        //新增元素,默认在数组最后新增
        public void add(int data) {
            //1.判断是否满，如果满，那就扩容
            if (isFull()) {
                //扩容
                this.elem = Arrays.copyof(this.elem, 2 * this.elem.length);
            }
            //2.不满进行插入
            this.elem[this.usedSize] = data;
            this.usedSize++;


            public boolean isFull () {
                //判断数组是否满了不能放元素
                if (this.usedSize == this.elem.length) {
                    return true;
                }
                return false;
            }
        }

        //在 pos 位置新增元素
        public void add(int pos, int data) {
            if (!this.checkPosInAdd(pos)) {
                throw new MyArrayListIndexOutOfException("添加方法的pos不合理！");
            } else {
                if (this.isFull()) {
                    this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
                }

                for(int i = this.usedSize - 1; i >= pos; --i) {
                    this.elem[i + 1] = this.elem[i];
                }
                this.elem[pos] = data;
                ++this.usedSize;
            }
        }

        //判定是否包含某个元素
        public boolean contains(int toFind) {
            for(int i = 0; i < this.usedSize; ++i) {
                if (this.elem[i] == toFind) {
                    return true;
                }
            }

            return false;

        }

        //查找某个与乃是对应的位置
        public int indexOf(int toFind) {
            return -1;
        }

        //获取 pos 位置的元素
        public int get(int pos) {
            return -1;
        }

        // 给 pos 位置的元素设为 value
        public void set(int pos, int value) {
            if (!checkPosInGet(pos)) {
                throw new MyArraylistIndexOutOfException("更行pos下标的元素，位置不合法");
                //
            }
        }

        //删除第一次出现的关键字key
        public void remove(int toRemove) {
            if (!checkPosInGet(pos)) {
                throw new MyArraylistIndexOutOfException("更行pos下标的元素，位置不合法");
                //


            }

            //获取顺序表长度
            public int size () {
                return 0;
            }

            //清空顺序表
            public void clear () {

            }
        }

        //homework
//    1.以下关于泛型的说法, 错误的是:
//
//
//    作业内容
//    A.泛型能够使一个方法同时兼容多种不同类型的参数
//    B.形如这样 MyArrayList<String> list = new MyArrayList() 的写法是合法的
//    C.针对方法和类都可以使用泛型
//    D.泛型不能针对静态内部类使用


//2.给定方法如下
//
//public static void printAll(MyArrayList<? extends Number> list) {
//
//  ...
//
//此时以下哪些调用方式是错误的
//
//
//作业内容
//A.printAll(new MyArrayList<Integer>());
//B.printAll(new MyArrayList<Double>());
//C.printAll(new MyArrayList<Number>());
//D.printAll(new MyArrayList<Object>());//D


    }



}



