public class Main {
    public static void main(String[] args){
        Board board=board.getInstance(100);
        ObstacleFactory.createSnakes(board,Arrays.asList(new int[][]{15,5},{99,2));
        ObstacleFactory.createLadders(board,Arrays.asList(new int[][]{4,90},{15,80}));

        Game game=new Game();
        Player p1=new Player("Alice");
        Player p2=new Player("Bob");

        game.addPlayer(p1);
        game.addPlayer(p2);

        DiceStrategy dice=new NormalDice();

        while (true){
            Player currentPlayer=game.getCurrentPlayer();
            int diceRoll=dice.rollDice();
            Command moveCommand=new MoveCommand(currentPlayer,diceRoll,board);
            moveCommand.execute();

            game.notifyPlayers(currentPlayer.getName()+"rooled a" + diceRoll + "and moved to" +currentPlayer.getPosition());

            if (currentPlayer.getPosition()==board.getSize()){
                game.notifyPlayers(currentPlayer.getName()+"wins!");
                break;
            }
            game.nextTurn();
        }
    }
}