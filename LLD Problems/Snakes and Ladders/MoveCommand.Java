public class MoveCommand implements Command{
    private Player player;
    private int steps;
    private Board board;

    public MoveCommand(Player player,int steps;Board board){
        this.player=player;
        this.steps=steps;
        this.board=board;
    }

    @override
    public void exceute(){
        int newPosition=player.getPosition()+steps;
        if (newPosition>board.getSize()){
            newPosition=board.getSize();
        }
        if (board.getSnakes().conatinsKey(newPosition)){
            newPosition=board.getSnakes().get(newPosition);
        }
        else if (board.getladders().conatinsKey(newPosition)){
           newPosition=board.getLadders().get(newPosition);
        }
        player.setPosition(newPosition);
    }
}