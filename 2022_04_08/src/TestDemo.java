import java.util.Locale;
import java.util.Scanner;

public class TestDemo {



    public static void main(String[] args) {
        String [][] map = new String[7][5];
        //初始化
        for(int i = 0; i < map.length; i++){
            //第一个数组
            for(int j = 0; j < map[i].length; j++){

                double rand = Math.random();
                if(rand < 0.2){
                    map[i][j] = "#";//豆子，分
                }
                else if(rand < 0.5) {
                    map[i][j] = "S";
                }
                else if(rand < 0.6){
                    map[i][j] = "B";//炸弹
                    }

                else{
                    map[i][j] = "*";//空白
                }

            }
        }
        int playerX = (int)(Math.random() * map[0].length);
        int playerY = (int)(Math.random() * map[0].length);

        map[playerY][playerX] = "1";

        for(int y = 0; y < map.length; y++){
            for(int x = 0; x < map[0].length; x++){
                System.out.print(map[y][x] + " ");
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
            int count = 0;
            count = Judge(targetX,targetY,map,count);
            targetX = playerX;
            targetY = playerY;

            System.out.println("分数：" + count);
        }while(true);

    }

    public static int Judge(int targetX, int targetY,String[][] map,int ret) {
        String str = map[targetY][targetX];
        if (str.equals("#")) {
            ret++;
        }
        if (str.equals("S")) {
            return ret--;
        }
        if (str.equals("B")) {

        }


    }

}


