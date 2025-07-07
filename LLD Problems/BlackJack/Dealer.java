public class Dealer extends Player {
    public Dealer() {
        setState(new PlayingState());
    }

    public boolean mustHit() {
        return getHand().getValue() < 17;
    }

    public void playTurn(Shoe shoe) {
        System.out.println("\nDealer's turn:");
        while (mustHit() && !isBusted()) {
            System.out.println("Dealer hits.");
            hit(shoe);
        }
        if (!isBusted()) {
            System.out.println("Dealer stands.");
            stand();
        }
    }
}