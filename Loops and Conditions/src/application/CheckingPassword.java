package application;

import java.util.Scanner;

public class CheckingPassword {
    public static void main(String[] args) {

        final String your_password = "321def";

        System.out.println("Hello there and welcome!\n");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter password: ");
            String password = scan.nextLine();

            if (your_password.equals(password)) {
                System.out.println("Login Successful!!");
                break;
            } else {
                System.out.println("Password or username doesnt match");
                System.out.println("Please try again");

            }
        }
        scan.close();
    }

}