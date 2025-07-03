public class Board {

    private static Board instance;

    private int size;

    private Map<int,int> snakes=new HashMap<>();

    private Map<int,int> ladders=new HashMap<>();

    private Board(int size){
        this.size=size;
    }

    public static Board getInstance(int size){
        if (instance==null){
            instance=new Board(size);
        }
        return instance;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<int, int> getLadders() {
        return ladders;
    }

    public void addLadder(int start,int end) {
        ladders.put(start,end);
    }

    public Map<int, int> getSnake() {
        return snakes;
    }

    public void addSnake(int start,int end) {
       snakes.put(start,end);
    }

}