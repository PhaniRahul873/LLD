public class NormalDice implements DiceStrategy{
    private Random random;

    public NormalDIce(){
        this.random=new random();
    }

    @overide
    public int rollDice(){
        return random.nextInt(6)+1;
    }
}