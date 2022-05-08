package sqlist;

import java.util.Arrays;

public class MyArrayList {

    public int[] elem;
    public int usedSized;//0


    public MyArrayList(){
        this.elem = new int[10];
    }

    //打印顺序表
    public void display(){
        //usedSized == 0;
        for (int i = 0; i < this.usedSized; i++) {
            System.out.println(elem[i] + " ");
        }
    }

    //新增元素，默认在数组最后新增
    public void add(int data){
        //1.先判断是不是满的，如果满的那么 进行 扩容

        if(isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //2.不满进行插入

    }

    //判断当前顺序表是不是满的
    public boolean isFull(){
        if(usedSized == this.elem.length){
            return true;
        }
        return false;
    }
}
