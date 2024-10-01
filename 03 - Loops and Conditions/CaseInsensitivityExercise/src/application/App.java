package application;

import java.util.Scanner;

public class App {
    /*
     * Case Insensitivity Exercise
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String START = "start";
        final String STOP = "stop";
        final String QUIT = "quit";

        System.out.print("Enter a command > ");
        String enterCommand = scan.nextLine();

        while(true){
            if(enterCommand.length() == 0){
                continue;
            }

            if(START.equalsIgnoreCase(enterCommand)){
                System.out.println("\nStarting ...");
                System.out.print("Enter a command > ");
                enterCommand = scan.nextLine();
            }else if(STOP.equalsIgnoreCase(enterCommand)){
                System.out.println("\nMachine stopping ...");
                System.out.print("Enter a command > ");
                enterCommand = scan.nextLine();
            }else if(QUIT.equalsIgnoreCase(enterCommand)){
                System.out.println("\nExiting ...");
                break;
            }else{
                System.out.println("\nUnrecognised command");
                System.out.print("Enter a command > ");
                enterCommand = scan.nextLine();
            }
        }
        scan.close();
    }
}