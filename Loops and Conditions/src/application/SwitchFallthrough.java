package application;

import java.util.Scanner;

public class SwitchFallthrough {
    public static void main(String[] args) {

        System.out.print("Do you want to proceed (y/n): ");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        switch (input) {
            case "y":
                System.out.println("Proceeding");
                break;
            case "n":
                System.out.println("Not proceeding");
                break;
            default:
                System.out.println("Unrecognised option");
                break;
        }
    }
}