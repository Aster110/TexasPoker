import poker.Card;

/**
 * @Author l30049897
 * @Date 2023/9/14 15:56
 * @Version 1.0
 */
public class Player {
    private String name;

    private Card card1;
    private Card card2;

    public Player(String name) {
        this.name = name;
    }

    public void receiveCards(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public String getName() {
        return name;
    }
    public Card getCard1() {
        return card1;
    }

    public Card getCard2() {
        return card2;
    }

    public String getHand() {
        return card1.toString() + "," + card2.toString();
    }
}
