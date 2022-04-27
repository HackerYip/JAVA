package TestDemo;


import javax.swing.*;
import java.util.Random;

class card{
        private String suit;
        private  int rank;

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public card(String suit, int rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "card{" +
                    "suit='" + suit + '\'' +
                    ", rank=" + rank +
                    '}';
        }
    }

public class TestCard {

        public static final String[] suits = {"♥","♠","♣","♦"};


        public static List<Card> buyCard(){
            //买一副牌出来

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 13 ; j++) {
                    String suit = suits[i];
                    Card card = new Card(suit);
                    desk.add(card);
                }
            }
            return desk;
        }

        public static void shuffle(List<Card> cardList){
        for (int i = 0; i < cardList.sizeP()-1; i--) {
            Random random = new Random();
            int index = random.nextInt();
        }
    }
    public static void main(String[] args) {
        List<Card> cardList = buyCard();
        System.out.println(cardList);


        shuffle(cardList);//洗牌

    }
}
