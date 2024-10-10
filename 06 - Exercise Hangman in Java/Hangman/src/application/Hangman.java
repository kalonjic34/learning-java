package application;

public class Hangman {

    private boolean running = false;
    private RandomWord word = new RandomWord();

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
        System.out.println(word);
    }
    
}