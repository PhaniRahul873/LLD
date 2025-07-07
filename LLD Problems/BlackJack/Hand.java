public class Hand {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getValue() {
        int sum = 0;
        int aceCount = 0;
        for (Card card : cards) {
            sum += card.getValue();
            if (card.isAce()) aceCount++;
        }
        while (aceCount-- > 0 && sum + 10 <= 21) {
            sum += 10;
        }
        return sum;
    }

    public boolean isBust() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return cards.size() == 2 && getValue() == 21;
    }

    @Override
    public String toString() {
        return cards.toString() + " (" + getValue() + ")";
    }
}
