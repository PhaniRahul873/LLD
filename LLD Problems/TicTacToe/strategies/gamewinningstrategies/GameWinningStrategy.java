public interface GameWinningStrategy {

    boolean checkIfWon(Board board, Player player, Cell moveCell);
}