package application;

import java.util.Scanner;

public class Hangman {

    private boolean running = false;
    private RandomWord word = new RandomWord();
    private Scanner scan = new Scanner(System.in);


    public void run() {
        while(running){
            displayWord();
            getUserInput();
            checkUserInput();
        }
    }

    private void checkUserInput() {
       if (word.isComplete()) {
        System.out.println("You have won");
        System.out.println("The word is: "+word);
        running = false;
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
       word.addGuess(guess.charAt(0));
    }

    void displayWord(){
        System.out.println(word);
    }

    public void close() {
        scan.close();
    }
    
}