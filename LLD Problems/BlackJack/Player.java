public class Player {
    private Hand hand = new Hand();
    private PlayerState state = new WaitingState();
    private double bet;

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public double getBet() {
        return bet;
    }

    public void hit(Shoe shoe) {
        state.hit(this, shoe);
    }

    public void stand() {
        state.stand(this);
    }

    public void leave() {
        state.leave(this);
    }

    public void bust() {
        System.out.println("Player explicitly busted.");
        setState(new BustedState());
    }

    public Hand getHand() {
        return hand;
    }

    public boolean isBusted() {
        return state instanceof BustedState;
    }

    public boolean hasStood() {
        return state instanceof StandState;
    }

    public boolean hasLeft() {
        return state instanceof LeftState;
    }
}
