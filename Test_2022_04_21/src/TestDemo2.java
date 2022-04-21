public class TestDemo2 {

    public static void main(String[] args) {
        //有时候我们抛出的异常是存在父子类关系的
        //所有的异常都继承于Exception
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[9]);
            System.out.println("haha");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.printStackTrace();
        }
    }
}
