package application;

import java.util.Scanner;

public class App {
    /*
     * If statements
     */
    public static void main(String[] args) {
        // If


          int apples = 10;
          int bananas = 5;
          
          if (apples > bananas) {
          System.out.println("More apples than bananas");
          }
          System.out.println("End of program.");


        // Using if


          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter room tempreture (F) > ");
          
          double tempretureFahrenheit = scan.nextFloat();
          
          double tempretureCelsius = (tempretureFahrenheit - 32) * (5.0 / 9.0);
          
          System.out.printf("Tempreture celsius: %.2f", tempretureCelsius);


        // Challenge:
        // If tempreture in celsius less than 21, print "Too cold!"
        // If tempreture in celsius greater than 21, print "Warm enough".


          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter room tempreture > ");
          double tempFahrenheit = scan.nextFloat();
          scan.close();
          double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9.0);
          
          if (tempCelsius < 21.0) {
          System.out.println("Too Cold!");
          }
          if (tempCelsius > 21.0) {
          System.out.println("Warm enough");
          }
          
         

        // If Else
          
          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter room tempreture > ");
          double tempFahrenheit = scan.nextFloat();
          scan.close();
          double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9.0);
          
          if (tempCelsius < 21.0) {
          System.out.println("To cold!");
          } else {
          System.out.println("Warm enough");
          }
         

        // if else if

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("\t1. Print 'hello'");
        System.out.println("\t2. Print 'How are you'");
        System.out.println("\t3. Exit program");
        System.out.println();
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
            System.out.println("You've found the hidden easter egg");
        } else {
            System.out.println("Invalid option.");
        }
        

        // One line if

        
        boolean isRaining = false;
        if(isRaining)
            System.out.println("Its raining");
        else
            System.out.println("Its not raining");

        System.out.println("Take an umbrella");
        

        
    }
}