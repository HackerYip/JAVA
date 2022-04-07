import java.util.Date;
import java.util.Scanner;

public class TestDemo {


   /* public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for(i = 1; i <= 9; i++) {
            //打印一行
            for(j = 0; j <= i; j++){
                System.out.printf("%d*%d=%-2d\t",i, j, i*j);
            }
            System.out.println();
        }

    }*/

        public static int is_leap_year(int years) {

            if ((years / 4 == 0 && years / 100 != 0) || (years / 400 == 0))
                return years;
            else
                return 0;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("please enter a year");

            int years = scanner.nextInt();

            System.out.println("please enter a month");

            int months = scanner.nextInt();

            int[] arr = new int[]{1, 3, 5, 7, 8, 10, 12};
            int[] arr2 = new int[]{4, 6, 9, 11};

//判断用户输入的年份是否是闰年
            int j = 0;//月份天数

            if ((months == 2) && (is_leap_year(years) != 0)) {
                j = 29;
            } else {
                j = 28;
            }

            for (int q = 0; q < arr.length; q++) {20
                if (months == arr[q]) {
                    j = 31;
                }

                for (int t = 0; t < arr.length; t++) {
                    if (months == arr[t]) {
                        j = 30;
                    }
                }

                Date date = new Date(years - 1900, months - 1, 1);
                //
                System.out.println(date.toLocaleString());
                //
                int day = date.getDay();
                System.out.println("星期天\t星期1\t星期2\t星期3\t星期4\t星期5\t星期6\t");
                for (int i = 0; i < day; i++) {
                    System.out.print("\t\t");
                }

                for (int i = 1; i <= j; i++) {
                    System.out.printf("%2d\t\t", i);

                    if ((i + day) % 7 == 0) {
                        System.out.println();
                    }
                }
            }
        }
    }





}
