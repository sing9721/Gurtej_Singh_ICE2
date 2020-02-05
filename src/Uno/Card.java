package Uno;

/**
 *
 * @author Gurtej singh
 */
public class Card {

    public enum Color {
        RED, YELLOW, GREEN, BLUE
    };

    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD
    };
    private final Color color;
    private final Value value;

    //constructors
    public Card(Color s, Value gVal) {
        color = s;
        value = gVal;
    }

    //accessors
    public Value getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }
}
