package application;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean gotCodeword = false;

        for (;;) {
            System.out.print(" > ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else if (input.equals("volcano")) {
                gotCodeword = true;

            }

        }
        scan.close();

        if (gotCodeword) {
            System.out.println("Codeword entered");
        } else {
            System.out.println("No codeword detected");
        }

    }
}