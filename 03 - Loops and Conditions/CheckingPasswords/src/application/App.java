package application;

import java.util.Scanner;

public class App {
    /*
     Password loops
     */
    public static void main(String[] args) {
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
    }
}