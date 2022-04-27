package TestDemo;

public class TestCard {



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
    public static void main(String[] args) {


    }
}
