package courses;

public class Game {

    private Dice dice1;
    private Dice dice2;
    private int score;
    private final int target;
    public Game(int target) {
        this.dice1 = new Dice(1);
        this.dice2 = new Dice(2);
        this.score = 0;
        this.target = target;

    }

    // method to role dice

    public void rollDice(){
        dice1.roll();
        dice2.roll();
        System.out.println("Dice one: " + dice1.getValue());
        System.out.println("Dice two: " + dice2.getValue());
        this.score =+ dice1.getValue()+ dice2.getValue();

        if(dice1.getValue() == dice2.getValue()){
            System.out.println("You rolled the two dice with same value so , bonus(10)💥💥💥 is awarded to you!");
            this.score = score+10;
        }
    }

    // method to show the current score

    public void showCurrentScore(){
        System.out.println("Current score: " + this.score);
        System.out.println("Current target: " +this.target);
    }

    public boolean isTargetReached(){
        return this.target >= this.score;
    }


}
