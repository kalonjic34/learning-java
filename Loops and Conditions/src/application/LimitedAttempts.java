package application;

import java.util.Scanner;

public class LimitedAttempts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String YOUR_PASSWORD = "123qwe!";

        boolean accessGranted = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Hi, please enter your password > ");
            String input_password = scan.nextLine();

            if (YOUR_PASSWORD.equals(input_password)) {
                System.out.println("Access granted");
                accessGranted = false;
                break;
            } else {
                System.out.println("Incorrect password");
            }

        }
        scan.close();

        if (!accessGranted) {
            System.out.println("Access denied");
        }

    }
}