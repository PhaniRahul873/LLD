public class BustCommand implements Command {
    private Player player;

    public BustCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.bust();
    }
}