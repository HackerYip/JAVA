public class TestDemo {

    public static void main12(String[] args) {
        int i = 1;
        while(i <= 100){
            if((i % 3 != 0) && (i % 5 != 0)){

                System.out.print(" "+ i);
                i++;

            }
            else{
                i++;
                continue;

            }
        }
    }


    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }


}
