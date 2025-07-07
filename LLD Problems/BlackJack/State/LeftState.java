public class LeftState implements PlayerState {
    @Override
    public void hit(Player player, Shoe shoe) {
        System.out.println("Cannot hit. Player has left.");
    }

    @Override
    public void stand(Player player) {
        System.out.println("Cannot stand. Player has left.");
    }

    @Override
    public void leave(Player player) {
        System.out.println("Already left.");
    }
}
