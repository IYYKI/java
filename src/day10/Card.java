package day10;

/**扑克牌**/
public class Card {
    /**点数**/
    private int rank;
    /**花色**/
    private int suit;
    public static final int THREE = 0;
    public static final int FOUR = 1;
    public static final int FIVE = 2;
    public static final int SIX = 3;
    public static final int SEVEN = 4;
    public static final int EIGHT = 5;
    public static final int NINE = 6;
    public static final int TEN = 7;
    public static final int JACK = 8;
    public static final int QUEEN = 9;
    public static final int KING = 10;
    public static final int ACE = 11;
    public static final int DEUCE = 12;
    public static final int BLACK = 13;
    public static final int COLOR = 14;


    public static int DIAMOND = 0;
    public static int CLUB = 1;
    public static int HEART = 2;
    public static int SPADE = 3;
    public static int JOKER = 4;
    public Card(){
    }
    public Card(int suit,int rank){
        //this.rank=rank;
        //this.suit=suit;
        setRank(rank);
        setSuit(suit);
    }

    private void setSuit(int suit) {
    }

    public int getRank(){
return getRank();
    }
    public String getRankName(){
        String[] RankNames=
                "3,4,5,6,7,8,9,10,J,Q,K,A,2,小,大".split(",");
                return RankNames[this.rank];
    }
    public String getSuitName(){
        String[] SuitNames=
        {"方块","梅花","红桃","黑桃","王"};
        return SuitNames[this.suit];
    }
    public void setRank(int rank){
        if (rank<THREE||rank>COLOR)
            throw new IllegalArgumentException("超了");
        this.rank = rank;
    }
    public void getSuit(int suit){
        this.suit=suit;
    }
}
