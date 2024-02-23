package application;

import java.util.Scanner;

public class VariableScope {
    public static void main(String[] args) {

        {
            int value = 0;
            System.out.println(value);

        }

        // Error - out of scope!
        // System.out.println(value);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }

        String input = null;
        do {
            System.out.println("Type 'quit' to quit the program");
            input = scan.nextLine();
        } while (!input.equals("quit"));

        scan.close();
    }

}