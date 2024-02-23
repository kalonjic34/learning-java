package application;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("First loop: ");

        do {
            System.out.println("Count: " + count);
        } while (count++ < 5);

        count = 0;

        System.out.println("Second loop:");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 3);
    }
}