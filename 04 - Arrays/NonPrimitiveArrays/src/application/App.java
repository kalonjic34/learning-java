package application;

public class App {
    /*
     * Non - primative arrays
     */
    public static void main(String[] args) {
        String text = null;
        // text = new String("Hello!");
        text = "Hello!";

        String[] texts = null;
        System.out.println(texts);
        texts = new String[3];
        System.out.println(texts);

        texts[0] = new String("Hi!");
        texts[1] = new String("How are you?");
        texts[2] = new String("Nice weather!");

        System.out.println();
        for(String word: texts){
            System.out.println(word);
        }
    }
}