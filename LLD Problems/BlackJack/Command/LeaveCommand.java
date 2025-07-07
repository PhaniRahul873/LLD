public class LeaveCommand implements Command {
    private Player player;

    public LeaveCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.leave();
    }
}