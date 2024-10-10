package application;

public class Hangman {

    private boolean running = true;

    public void run() {
        while(running){
            displayWord();
            getUserInput();
            checkUserInput();
        }
    }

    private void checkUserInput() {
       System.out.println("checkUserInput");
    }

    private void getUserInput() {
       System.out.println("getUserInput");
    }

    void displayWord(){
        System.out.println("displayWord");
    }
    
}