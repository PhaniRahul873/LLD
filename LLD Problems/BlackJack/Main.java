public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setState(new PlayingState());
        player.setBet(100);

        Shoe shoe = new Shoe(1);

// Commands
        Command hitCommand = new HitCommand(player, shoe);
        Command standCommand = new StandCommand(player);
        Command leaveCommand = new LeaveCommand(player);

// Player performs actions
        hitCommand.execute();
        hitCommand.execute();
        standCommand.execute();
        leaveCommand.execute();
        // Will still execute in any state (safe state switch)
    }
}