public class BustedState implements PlayerState {
    @Override
    public void hit(Player player, Shoe shoe) {
        System.out.println("Cannot hit. Player busted.");
    }

    @Override
    public void stand(Player player) {
        System.out.println("Cannot stand. Player busted.");
    }

    @Override
    public void leave(Player player) {
        System.out.println("Player left after busting.");
        player.setState(new LeftState());
    }
}
