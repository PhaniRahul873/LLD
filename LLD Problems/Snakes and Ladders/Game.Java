public class Game {
    private List<Player> players;
    private int currentPlayerIndex;

    public Game(){
        this.palyers=new ArrayList<>();
        this,currentPlayerIndex=0;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void notifyPlayers(String mssage){
        for (Player player: players){
            player.update(message);
        }
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }

    public void nextTurn(){
        currentPlayerIndex= (currentPlayerIndex +1 )%players.size();
    }
}