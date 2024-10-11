package application;

import java.util.Scanner;

public class Hangman {

    private boolean running = false;
    private RandomWord word = new RandomWord();
    private Scanner scan = new Scanner(System.in);
    private int triesRemaining =5;
    private char lastGuess;


    public void run() {
        while(running){
            displayWord();
            getUserInput();
            checkUserInput();
        }
    }

    private void checkUserInput() {
       boolean isCorrect = word.addGuess(lastGuess);

       if(isCorrect){
        if (word.isComplete()) {
            System.out.println("You have won");
            System.out.println("The word is: "+word);
            running = false;
           }
       }else{
        triesRemaining--;
        if(triesRemaining == 0){
            System.out.println("You have lost!");
            running = false;
        }
       }

    }

    private void getUserInput() {
       System.out.println("getUserInput");

       // Ask the user to enter a character
       // Get the character as a string
       // Pass the character to RandomWord as the
       // argument to a method

       System.out.print("Enter your guess: ");
       String guess = scan.nextLine();
       lastGuess = guess.charAt(0);
    }

    void displayWord(){
        System.out.println("Tries remaining: "+triesRemaining);
        System.out.println(word);
    }

    public void close() {
        scan.close();
    }
    
}