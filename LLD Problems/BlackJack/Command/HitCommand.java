public class HitCommand implements Command {
    private Player player;
    private Shoe shoe;

    public HitCommand(Player player, Shoe shoe) {
        this.player = player;
        this.shoe = shoe;
    }

    @Override
    public void execute() {
        player.hit(shoe);
    }
}