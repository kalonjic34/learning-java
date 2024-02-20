package application;

import java.util.Scanner;

public class MoreIfElseIf {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("=====");

        System.out.println("\t1. Print 'hello'");
        System.out.println("\t2. Print 'How are you'");
        System.out.println("\t3. Exit program\n");
        System.out.print("Enter an option > ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        scan.close();

        if (input == 1) {
            System.out.println("Hello");
        } else if (input == 2) {
            System.out.println("How are you?");
        } else if (input == 3) {
            System.out.println("Exiting ...");
            System.exit(0);
        } else if (input > 100) {
            System.out.println("You found the hidden easter egg");
        } else {
            System.out.println("Invalid option");
        }
    }

}