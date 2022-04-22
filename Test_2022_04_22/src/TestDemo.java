public class TestDemo {

//    public class Example{
//        String str = new String("good");
//        char[ ] ch = { 'a' , 'b' , 'c' };
//        public static void main(String args[]){
//            Example ex = new Example();
//            ex.change(ex.str,ex.ch);
//            System.out.print(ex.str + " and ");
//            System.out.print(ex.ch);
//        }
//        public void change(String str,char ch[ ]){
//            str = "test ok";
//            ch[0] = 'g';
//        }
//    }


//    public class SystemUtil{
//        public static boolean isAdmin(String userId){
//            return userId.toLowerCase()=="admin";
//        }
        public static void main(String[] args){
            String s1="abc"+"def";//1
            String s2=new String(s1);//2
            if(s1.equals(s2))//3
                System.out.println(".equals succeeded");//4
            if(s1==s2)//5
                System.out.println("==succeeded");//6
        }
    //}




    void func1(int N){
        int count = 0;
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N ; j++) {
                count++;
            }
        }

        for (int k = 0; k < 2 * N ; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);

    }


    void bubbleSort(int[] array) {
            //时间复杂度
        for (int end = array.length; end > 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if (array[i - 1] > array[i]) {
                    Swap(array, i - 1, i);
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
    }



    int binarySearch(int[] array, int value) {

        int begin = 0;

        int end = array.length - 1;

        while (begin <= end) {

            int mid = begin + ((end-begin) / 2);
            if (array[mid] < value) {
                begin = mid + 1;
            }
            else if (array[mid] > value){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    long factorial(int N) {
        return N < 2 ? N : factorial(N-1) * N;
    }

    int fibonacci(int N) {

        return N < 2 ? N : fibonacci(N-1)+fibonacci(N-2);

    }
}
