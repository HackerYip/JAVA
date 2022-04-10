public class Test {

    public static void main(String[] args) {
        double[] array = new double[10];//默认用0初始化
        String[] strings = new String[10];//引用类型，默认用null初始化


        System.out.println("fsfas");
    }


    public static void main1(String[] args) {
          int a1 = 1;
          int a2 = 2;
          int a3 = 3;
          int a4 = 4;
          //1.中括号 当中  不能有任何的数字
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,10};

        int ret = array[2];
        System.out.println("array数组的2下表元素是: " + ret);

        int[] array3 = new int[10];//没有初始化，那么有没有默认值呢?
        array3[0] = 10;//不清楚数组里面的元素，类比动态内存分配

        System.out.println(array.length);//根据数组名.length来自动获取 数组的长度
    }

}
