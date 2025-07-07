public class PlayingState implements PlayerState {
    @Override
    public void hit(Player player, Shoe shoe) {
        Card card = shoe.draw();
        player.getHand().addCard(card);
        System.out.println("Player hits and gets: " + card);

        if (player.getHand().isBust()) {
            System.out.println("Player busted!");
            player.setState(new BustedState());
        }
    }

    @Override
    public void stand(Player player) {
        System.out.println("Player stands.");
        player.setState(new StandState());
    }

    @Override
    public void leave(Player player) {
        System.out.println("Player left the game.");
        player.setState(new LeftState());
    }
}
