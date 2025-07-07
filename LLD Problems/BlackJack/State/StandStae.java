public class StandState implements PlayerState {
    @Override
    public void hit(Player player, Shoe shoe) {
        System.out.println("Cannot hit. Player already stood.");
    }

    @Override
    public void stand(Player player) {
        System.out.println("Already in stand state.");
    }

    @Override
    public void leave(Player player) {
        System.out.println("Player left after standing.");
        player.setState(new LeftState());
    }
}
