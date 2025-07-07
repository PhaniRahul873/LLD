public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return switch (rank) {
            case JACK, QUEEN, KING -> 10;
            case ACE -> 1;
            default -> rank.ordinal() + 2;
        };
    }

    public boolean isAce() {
        return rank == Rank.ACE;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}