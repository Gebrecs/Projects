package Inheritance;

public class WordGame {
    protected String word;
    protected int attempts;
    protected char []revealedLetters;
    // constructor

    public WordGame(String word){
        this.word=word;
        this.attempts=0;
        this.revealedLetters=new char[word.length()];

        // let's loop through the word and set the revealed letters to underscores
        for(int i=0;i<word.length();i++){
            revealedLetters[i]='_';
        }

    }
    // method to show the hint for the letter
    public void showHint(){
        for(char c:revealedLetters){
            System.out.println(c + " ");
        }
    }
    public void revealLetters(){
        for(int i=0;i<word.length();i++){
            revealedLetters[i]=word.charAt(i);
            break;

        }
    }
    public boolean isWordGuessed(){
        return word.equals(new String(revealedLetters));
    }
    public void playGame(){
        System.out.println("Welcome to the Word Game!");
        System.out.println("Game started!");
    }
}
