package courses;

import java.util.Random;
public class Dice {

    private int value;

    // constructor to initialize the value

    public  Dice(int value) {
        this.value = value;
    }

    // method to roll dice
    public void roll(){
        Random rand = new Random();

        // this keyword is mandatorily used to distinguish the local variable and the class property
        this.value= rand.nextInt(6)+1;

        // the following ways is also possible
        //int randValue=(int)(Math.random()*6) +1;
    }

    // another method to get the current value
    public int getValue(){
        return this.value;
    }
}
