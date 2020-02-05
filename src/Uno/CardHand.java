package Uno;

/**
 *
 * @author Gurtej singh
 */
public class CardHand {

    private final int handSize = 60;
    public Card[] cards = new Card[handSize];

    public void generateHand() {
        int countCards = 0;
        for (Card.Color s : Card.Color.values())
        {
            for (Card.Value v : Card.Value.values()) {
                cards[countCards] = (new Card(s, v));
                countCards++;
            }
        }//end outter for
    }//end method

}
