package application;

public class PostfixPrefixDecrement {
    public static void main(String[] args) {
        int otters = 5;
        int giraffes = 10;
        int elephants = 3;

        int animals = ++otters;

        System.out.printf("Otters: %d\n", otters);
        System.out.printf("giraffes: %d\n", giraffes);
        System.out.printf("Elephants: %d\n", elephants);
        System.out.printf("Animals: %d\n", animals);
    }
}