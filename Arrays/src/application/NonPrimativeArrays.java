package application;

public class NonPrimativeArrays {
    public static void main(String[] args) {
        String text;
        // text = new String("hello");

        text = "Hello!";

        String[] texts = null;
        texts = new String[3];
        System.out.println(texts);

        System.out.println();

        texts[0] = new String("Hi");
        texts[1] = "How are you?";
        texts[2] = "Nice weather";

        for (String word : texts) {
            System.out.println(word);
        }
    }
}