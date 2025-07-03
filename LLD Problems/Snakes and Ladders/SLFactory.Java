public class SLFactory {
    public static void createSnakes(Board board,List<int[]> snakes){
        for (int[] snake:snakes){
            board.addSnake(snake[0],snake[1]);
        }
    }

    public static void createSnakes(Board board,List<int[]> ladders){
        for (int[] snake:snakes){
            board.addLadder(ladder[0],ladder[1]);
        }
    }
}