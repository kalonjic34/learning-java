package application;

import java.util.Arrays;

public class StreamIteration {
    public static void main(String[] args) {

        // String[] animals = { "dog", "bear", "horse" };

        // Arrays.stream(animals).forEach(animal -> {
        // System.out.println(animal);
        // });

        String[] fruit1 = { "Apple", "Orange", "Peer" };

        Arrays.stream(fruit1).forEach(fruit -> {
            System.out.println(fruit);
        });

    }
}