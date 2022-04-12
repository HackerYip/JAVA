public class TestDemo {

    //写一个函数， 数组以字符串的形式进行输出[1,2,3,4]

    public static String myToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if(i != array.length - 1){
                str += ",";
            }
        }
                str += ",";
                return str;
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        String ret = myToString(array);
        System.out.println(ret);
    }

}
