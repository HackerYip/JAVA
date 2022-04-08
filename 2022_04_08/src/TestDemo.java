import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class TestDemo {


    private static int count = 0;//全局，记分;

    public static void main(String[] args) {
        String [][] map = new String[10][12];
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
        int playerX = (int)(Math.random() * map[0].length);
        int playerY = (int)(Math.random() * map[0].length);

        int portalX =(int)(Math.random() * map[0].length);
        int portalY =(int)(Math.random() * map[0].length);

        int portalX2 =(int)(Math.random() * map[0].length);
        int portalY2=(int)(Math.random() * map[0].length);

        map[portalX][portalY] = "P";
        map[portalX2][portalY2] = "P";


        for(int y = 0; y < map.length; y++){
            for(int x = 0; x < map[0].length; x++){
                System.out.printf("%-2s\t",map[y][x]);
            }

            System.out.println();
        }
        int targetX = playerX, targetY = playerY;


        do {

            Scanner scanner = new Scanner(System.in);

            String str = scanner.next().toLowerCase();


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
                    break;
                case 4:







                    break;


            }

        }while(true);

    }

    public static int Judge(int targetX, int targetY,String[][] map) {
        String str = map[targetY][targetX];
        if (str.equals("#")) {
            return 1;
        } else if (str.equals("S")) {
            return 2;
        } else if (str.equals("B")) {
            return 3;
        } else  {
            return 4;
        }
    }
}

