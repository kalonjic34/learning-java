package application;

import java.util.Scanner;

public class App {
    /*
     * Primative arrays exercise
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[3];

        for(int i = 0;i < numbers.length;i++){
            System.out.print("Enter a number: ");
            int input = scan.nextInt();
            numbers[i] = input;
        }
        scan.close();

        System.out.println("You have entered: ");

        int total =0;
        for(int i = 0; i < numbers.length;i++){
            System.out.println(numbers[i]);
            total += numbers[i];            
        }
        System.out.print("total of numbers: "+total);
    }
}