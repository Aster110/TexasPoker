package poker;

/**
 * @Author l30049897
 * @Date 2023/9/14 15:20
 * @Version 1.0
 */


public class Card {
    // 花色
    private String suit;

    // 点数
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String toString() {
        return rank + suit;
    }
}
