import java.util.Scanner;

public class TeatDemo {
    //1.方法名相同
    //2.参数列表不同(个数，顺序，类型)
    //3.返回值无要求，不影响重载
    //满足这三个要求就叫，方法的重载

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static void main13(String[] args) {

    }




    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;

    }


public static int add3(int a, int b){

    return a + b;
}
    public static void main12(String[] args) {
        int x = 10;
        int y = 10;
        int ret = add(x,y);//值传递
        System.out.println();
        swap(x,y);
        System.out.println();
        System.out.println(ret);
    }


    public static void login(){
        int count = 3;
        Scanner scanner = new Scanner(System.in);

        while(count != 0){
            String password = scanner.nextLine();
            System.out.println("请输入你的密码,你有三次机会: ");
            if(password.equals("123")){
                System.out.println("登录成功");
                return;
            }
            else{
                count--;
                System.out.println("你还有" + count + "次机会");
            }
        }
    }

    public static void main11(String[] args) {
        login();
    }


    public static void func7(int n){

        for (int i = 31; i >= 1; i-=2  ) {
            System.out.println(((n >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i-=2) {
            System.out.println(((n >> i) & 1) + " ");
        }
    }


    public static void main10(String[] args) {
        func7(7);
    }



    public static int func6(int n){
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }


    public static int func5(int n) {
        int count1 = 0;
        while (n != 0) {
            if ((n & 1) == 0) {
                count1++;
            }
            n = n >>> 1;

        }
        return count1;
    }




    public static int func4(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n >> 1) & 1) != 0){
                count++;
            }
        }
        return count;
    }


    public static void main9(String[] args) {
        System.out.println(func4(4));//时间复杂度必须移动32次，所以可以优化
        System.out.println(func5(4));
        System.out.println(func6(4));
    }



    public static void func3(){
        for(int num = 0; num < 999_999; num++){
            //1.求这个数是几位数
            int count = 0;
            int tmp = num;
            while(num != 0){
                count++;
                tmp /= 10;
            }
            //已经求得了num是几位数了
            //但是为了求几位数，num == 0了
            //所以此时创建一个tmp变量，让tmp来试除，最后num重新赋值给tmp
            tmp = num;//123
            //求这个数字的每一位是几，把每一位的次幂加起来
            int sum = 0;
            while(tmp != 0){
                sum += Math.pow(tmp % 10,count);//pow是double类型，但是这里用了+=，所以消除了类型差异
                tmp /= 10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }
    }


    public static void main8(String[] args) {
            func3();
    }



    public static int func2(int a, int b){

        int c = a % b;
        while(c != 0){
            a = b;
            b = c;
            c = a % b;
        }
            return b;
    }

    public static void main7(String[] args) {
        System.out.println(func2(18,24));
    }


//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

    }

    public static void main5(String[] args) {

//        int hun = (i / 100) % 10;//百位
//        int ten = (i / 10) % 10;//十位
//        int uni = i % 10;//个位
        int count = 0;//计数器
        for(int i = 10; i <= 999; i++){
            if(((i / 100) % 10)*((i / 100) % 10)*((i / 100) % 10)+ ((i / 10) % 10)*((i / 10) % 10)*((i / 10) % 10) + (i % 10)*(i % 10)*(i % 10) == i){
                System.out.println(i + "是一个水仙花数");
                count++;
            }
        }
        System.out.println("0~999的水仙花个数一共有:" + count + "个");
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

                if((age > 0) && (age < 17)){
                    System.out.println("当前年龄的人是少年");
                }

                else if((age >= 19) && (age <= 28)){
                    System.out.println("当前年龄的人是青年");
                }

                else if((age >= 29) && (age <= 55)){
                    System.out.println("当前年龄的人是中年");
                }

                else if(age > 56){
                    System.out.println("当前年龄的人是老年");
                }
        }




    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while((n > 0) && (n % 2 != 0)) {
            System.out.println(n + "是素数");
              break;
        }
    }

    public static void main2(String[] args) {
        int flag = 0;//判断素数标志
        for(int i = 1; i <= 100; i++){
            flag = 1;
            for(int j = 2; j < i; j++){
                if(j % i == 0){
                    flag = 0;//能整除的话就置为0，证明不是素数
                    break;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        int count = 0;
        for(int y = 1000; y <= 2000; y++){
            if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)){
                System.out.println(" "+ y);
                count++;
            }
        }
        System.out.println("闰年的个数: "+ count);
    }




    public static void main15(String[] args) {
        int i = 0;
        int j = 0;
        for(i = 1; i <= 9; i++) {
            //打印一行
            for(j = 1; j <= i; j++){
                System.out.printf("%d*%d=%-2d\t",j, i, j*i);
            }
            System.out.println();
        }

    }


    public static void func10(int n){
        for (int i = 31; i >= 1; i-=2) {
            System.out.println(((n >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i-=2) {
            System.out.println(((n >> i) & 1) + " ");
        }
    }
    public static void main14(String[] args) {

      func10(10);
    }



    public static int fib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        int tmp = fib(n-1)+fib(n-2);
        return tmp;
    }

    public static int fib2(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }

        int f1 = 0;
        int f2 = 1;

        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main17(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(10));
        System.out.println(fib(15));
        System.out.println(fib2(1));
        System.out.println(fib2(10));
        System.out.println(fib2(15));
    }


    public static void print2(int[] array, int len){
        if(len == array.length-1){
            System.out.println(array[len]);
            return;
        }
        print2(array,len+1);
        System.out.println(array[len]);
    }


    public static void print(int[] array, int len){
        if(len == 1){
            System.out.println(array[len-1]);
            return;
        }

        System.out.println(array[len-1]);
        print(array,len-1);
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        print(array,array.length);
    }
}
