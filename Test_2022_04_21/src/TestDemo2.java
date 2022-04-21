public class TestDemo2 {

    public static void main(String[] args) {
        //有时候我们抛出的异常是存在父子类关系的
        //所有的异常都继承于Exception
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[9]);
            System.out.println("haha");
//        }catch(Exception e){
//            e.printStackTrace();//此时编译器懵了，不管抛出啥异常编译器都能捕捉到
//            //所以不能把父类放在最前头
        }
        catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();//要放在这里，兜底
            //放在这里的意思就是
            //假设程序捕获不到上面所写的异常
            //那么就在这一段代码里面拦住所有的异常
        }
    }
}
