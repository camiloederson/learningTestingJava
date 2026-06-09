package miKdev.diceGame;

public class Player {

    private final Dice dice;

    public Player(Dice dice) {
        this.dice = dice;
    }

    public boolean play(){
        return dice.roll() >= 4;
    }
}
