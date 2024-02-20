package application;

import java.util.Scanner;

public class ConvertIfElseToSwitch {
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

        if (input > 100) {
            System.out.println("You have found the easter egg");
        } else {
            switch (input) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("How are you?");
                    break;
                case 3:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}