public class WaitingState implements PlayerState {
    @Override
    public void hit(Player player, Shoe shoe) {
        System.out.println("Cannot hit. Player is waiting.");
    }

    @Override
    public void stand(Player player) {
        System.out.println("Cannot stand. Player is waiting.");
    }

    @Override
    public void leave(Player player) {
        System.out.println("Player left while waiting.");
        player.setState(new LeftState());
    }
}
