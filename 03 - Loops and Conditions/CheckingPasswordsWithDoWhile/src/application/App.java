package application;

import java.util.Scanner;

public class App {
    /*
     * Check password with do while
     */
    public static void main(String[] args) {

        // code with infinite while loop

        Scanner scan = new Scanner(System.in);
        final String USER_PASSWORD = "pass4chris";
        System.out.print("Please enter your password > ");
        String inputPassword = scan.nextLine();

        while(true){
            if(USER_PASSWORD.equals(inputPassword)){
                System.out.println("\nCorrect password");
                System.out.println("Logging in ...");
                break;
            }else{
                System.out.println("\nIncorrect password");
                System.out.print("Try again > ");
                inputPassword = scan.nextLine();
            } 
        }
        scan.close();
        

        // code with do while

        final String USER_PASSWORD = "pass4chris";
        System.out.print("Please enter your password > ");
        String inputPassword = scan.nextLine();

        do{
            System.out.println("\nIncorrect password");
            System.out.print("Try again > ");
            inputPassword = scan.nextLine();
        }
        
        while(!USER_PASSWORD.equals(inputPassword));
        scan.close();
        System.out.println("\nCorrect password");
        System.out.println("logging in ...");
        
    }
    
}