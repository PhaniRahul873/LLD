class Shoe {
    private List<Card> cards = new ArrayList<>();

    public Shoe(int deckCount) {
        for (int i = 0; i < deckCount; i++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        }
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
