package application;

import java.util.stream.IntStream;

public class IteratingWithInStream {
    public static void main(String[] args) {
        String[] animals = { "cat", "dog", "sloth", "elephant" };

        IntStream.range(0, animals.length).forEach(i -> {
            System.out.println(i + ". " + animals[i]);
        });

        // for (int i = 0; i < animals.length; i++) {
        // System.out.println(animals[i]);
        // }
    }
}