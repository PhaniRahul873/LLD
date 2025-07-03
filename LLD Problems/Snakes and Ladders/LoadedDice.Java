public class LoadedDice implements DiceStrategy{
    private Random random;

    public LoadedDIce(){
        this.random=new random();
    }

    @overide
    public int rollDice(){
        return random.nextInt(3)+4;
    }
}