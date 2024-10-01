package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* 
        Switch
        */ 
        
        /* 

        int option = 10;

        switch(option){
        case 0:
            System.out.println("Option 0 selected");
            break;
        case 1:
            System.out.println("Option 1 selected");
            break;
        case 10:
            System.out.println("Exiting program...");
            System.exit(0);
            break;
        default:
            System.out.println("Invalid option");
            break;
        }

        */

        // Switch Fallthrough

        System.out.print("Do you want to proceed (y/n): ");
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        switch(input){
            case "y":
                System.out.println("Proceeding ...");
                break;
            case "n":
                System.out.println("Not proceeding ...");
                break;
            default:
                System.out.println("Unrecognised option");
                break;
        }
    }
}