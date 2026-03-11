
import java.util.Random;
import java.util.Scanner;

class NoGuessGame {
    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
        boolean b =g.isCorrectNumber();
        System.out.println(b);

    }
}

class Game{
    public int noOfGuesses;
    public int number;
    public int  inputNumber;
    void Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
     }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    void takeUserInput(){
        System.out.println("Guess the no.");
        Scanner sc = new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        if (inputNumber==number){
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Less");
        }
        else if(inputNumber>number){
            System.out.println("Too High");
        }
        return false;
    }
}