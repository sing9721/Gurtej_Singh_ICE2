package Uno;

/**
 *
 * @author Gurtej singh
 */
public class GamePlayer {

    public static void main(String[] args) {
        CardHand ch = new CardHand();
        ch.generateHand();
        for (Card c : ch.cards)//reading from Colors
        {
            System.out.println(c.getValue() + " of " + c.getColor());
        }
    }

}
