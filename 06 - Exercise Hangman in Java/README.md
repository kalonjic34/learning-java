# Hangman Exercise in Java

This repository contains a Java implementation of the Hangman game, showcasing various programming concepts and techniques.

## Key Concepts Learned

### Top-Down Design

- **Structured Approach**: Break down the problem into smaller, manageable parts.

### Object-Oriented Programming

- **Classes and Objects**: Implemented `Hangman` and `RandomWord` classes.
- **Encapsulation**: Used private fields and public methods to manage object state.

### Randomness

- **Random Word Selection**: Utilized `java.util.Random` to select a word randomly from an array.

### User Interaction

- **Input Handling**: Used `Scanner` to capture user input for guesses.
- **Feedback**: Provided feedback to users on their guesses and remaining attempts.

### Game Logic

- **Word Display**: Displayed the current state of the word with blanks.
- **Guess Checking**: Implemented logic to check user guesses against the selected word.
- **Win/Loss Conditions**: Managed game flow based on correct guesses and remaining tries.

### Code Optimization

- **StringBuilder**: Used `StringBuilder` for efficient string manipulation.
- **Boolean Logic**: Managed game state transitions and user feedback using boolean checks.

## Program Structure

### Code

### App Class

```java
public class App {
    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.run();
        game.close();
    }
}
```

- **Purpose**: This is the entry point of the application.
- **Main Method**: Creates a `Hangman` game object, starts the game with `run()`, and closes resources with `close()`.

### Hangman Class

```java
import java.util.Scanner;

public class Hangman {

    private boolean running = false;
    private RandomWord word = new RandomWord();
    private Scanner scan = new Scanner(System.in);
    private int triesRemaining = 5;
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
               System.out.println("The word is: " + word);
               running = false;
           }
       } else {
           triesRemaining--;
           if(triesRemaining == 0){
               System.out.println("You have lost!");
               running = false;
           }
       }
    }

    private void getUserInput() {
       System.out.print("Enter your guess: ");
       String guess = scan.nextLine();
       lastGuess = guess.charAt(0);
    }

    void displayWord(){
        System.out.println("Tries remaining: " + triesRemaining);
        System.out.println(word);
    }

    public void close() {
        scan.close();
    }
}
```

- **Attributes**:
  - `running`: Controls the game loop; initialized to `false`.
  - `word`: An instance of `RandomWord` to manage the word being guessed.
  - `scan`: A `Scanner` for reading user input.
  - `triesRemaining`: Tracks the number of attempts left.
  - `lastGuess`: Stores the last character guessed by the user.

- **Methods**:
  - `run()`: Main game loop that continues until `running` is `false`.
  - `checkUserInput()`: Verifies if the guess is correct and checks win/loss conditions.
  - `getUserInput()`: Prompts the user for a guess and updates `lastGuess`.
  - `displayWord()`: Shows the current state of the guessed word and remaining tries.
  - `close()`: Closes the `Scanner` to free resources.

### RandomWord Class

```java
import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "family", "infant", "tongue", "nothing", "longer", "explicit", "authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "inscription"};

    private String chosenWord;
    private Random random = new Random();
    private char[] characters;

    public RandomWord(){
        chosenWord = words[random.nextInt(words.length)];
        characters = new char[chosenWord.length()];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(char c: characters){
            sb.append(c == '\u0000' ? '_': c);
            sb.append(' ');
        }
        return sb.toString();
    }

    public boolean isComplete(){
        for(char c: characters){
            if(c == '\u0000'){
                return false;
            }
        }
        return true;
    }

    public boolean addGuess(char c) {
        boolean correct = false;

        for(int i = 0; i < chosenWord.length(); i++){
            if(c == chosenWord.charAt(i)){
                characters[i] = c;
                correct = true;
            }
        }

        return correct;
    }
}
```

- **Attributes**:
  - `words`: Array of possible words to be guessed.
  - `chosenWord`: The word randomly selected for the current game.
  - `random`: An instance of `Random` for selecting a word.
  - `characters`: Array representing the current state of the guessed word.

- **Methods**:
  - `RandomWord()`: Constructor initializes `chosenWord` and `characters`.
  - `toString()`: Returns a string representing the current state of the word with underscores for unguessed letters.
  - `isComplete()`: Checks if the word has been completely guessed.
  - `addGuess(char c)`: Updates `characters` with correct guesses and returns whether the guess was correct.


```

This project demonstrates the integration of multiple Java concepts to build a functional and interactive application.
```