import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/*
public class TestDemo {

*/
/*
    public static void main(String[] args) {
        int a = 10;
        ++a;
        System.out.println(a);
    }
*//*


    private static int count = 0;//全局，记分;

    static int playerX,playerY;

    static int  portalX, portalY, portalX2,portalY2;

    public static void main(String[] args) {
        String [][] map = new String[12][12];
        //初始化
        for(int i = 0; i < map.length; i++){
            //第一个数组
            for(int j = 0; j < map[i].length; j++){

                double rand = Math.random();
                if(rand < 0.2){
                    map[i][j] = "★";//豆子，分
                }
                else if(rand < 0.5) {
                    map[i][j] = "※";//扣分
                }
                else if(rand < 0.6){
                    map[i][j] = "B";//炸弹
                    }
                else{
                    map[i][j] = "□";//空白
                }
            }
        }
         playerX = (int)(Math.random() * map[0].length);
         playerY = (int)(Math.random() * map[0].length);

         portalX =(int)(Math.random() * map[0].length);
         portalY =(int)(Math.random() * map[0].length);

         portalX2 =(int)(Math.random() * map[0].length);
         portalY2=(int)(Math.random() * map[0].length);

        map[portalX][portalY] = "P";
        map[portalX2][portalY2] = "P";
        map[playerY][playerX] = "㊣";


        do {

        for(int y = 0; y < map.length; y++){
            for(int x = 0; x < map[0].length; x++){
                System.out.printf("%-2s\t",map[y][x]);
            }

            System.out.println();
        }




            Scanner scanner = new Scanner(System.in);

            String str = scanner.next().toLowerCase();

            int targetX = playerX, targetY = playerY;
            switch (str) {
                case "w"://up
                    targetY--;

                    if (targetY < 0) {
                        continue;
                    }
                    break;
                case "s"://down

                    targetY++;

                    if (targetY > map[0].length - 1) {
                        continue;

                    }

                    break;
                case "a"://left
                        targetX--;

                        if(targetX < 0){
                            continue;
                        }
                    break;
                case "d"://right
                        targetX++;

                        if(targetX > map[0].length - 1){
                            continue;
                        }
                    break;
            }
            int ret = 0;
            ret = Judge(targetX,targetY,map);
            targetX = playerX;
            targetY = playerY;

            switch(ret){
                case 1:
                    System.out.println("分数：" + (++count));
                    break;
                case 2:
                    System.out.println("分数：" + (--count));
                    break;
                case 3:
                    count = 0;
                    System.out.println("分数:" + count);
                    return;
                case 4:
                case 5:
                    break;


            }

        }while(true);

    }

    */
/**
     * 判断目标位置，移动玩家
     * @param targetX
     * @param targetY
     * @param map
     * @return
     *//*

    public static int Judge(int targetX, int targetY,String[][] map) {
        String str = map[targetY][targetX];
        if (str.equals("★")) {//豆子
            map[targetY][targetX] = "㊣";
            map[playerY][playerX] = "□";//空白
            playerY = targetY;
            playerX = targetX;
            return 1;
        } else if (str.equals("※")) {
            map[targetY][targetX] = "㊣";
            map[playerY][playerX] = "□";//空白
            playerY = targetY;
            playerX = targetX;
            return 2;
        } else if (str.equals("B")) {
            map[targetY][targetX] = "㊣";
            map[playerY][playerX] = "□";//空白
            playerY = targetY;
            playerX = targetX;
            return 3;
        } else if (str.equals("P")) {
           //查找传送们的另一端
            if(targetX == portalX && targetY == portalY){
                map[portalY2][portalX2] = "㊣";
                map[playerY][playerX] = "□";//玩家原来的位置置空
                map[portalX][portalY] = "□";//第一个传送门置空
                playerY = targetY;
                playerX = targetX;
            }else {
                if(targetX == portalX && targetY == portalY) {
                    map[portalY2][portalX2] = "㊣";
                    map[playerY][playerX] = "□";//玩家原来的位置置空
                    map[portalX][portalY] = "□";//第一个传送门置空
                    playerY = targetY;
                    playerX = targetX;
                }
            }
            return 4;
        } else  {
            return 5;
        }
    }
}
*/




public class TestDemo {

    public static void main(String[] args) {
        String[] Province = {"四川", "云南", "广西"};

        String[] city1 = {"成都", "绵阳"};
        String[] city2 = {"昆明", "大理"};

        String[][] cities = {city1, city2};

        System.out.println("1.查看城市");
        System.out.println("2.增加城市");
        System.out.println("3.删除城市");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        switch (num) {

        }
    }
}


