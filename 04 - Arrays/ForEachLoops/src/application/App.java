package application;

import java.util.Scanner;

public class App {
    /*
     * For each loops
     */
    public static void main(String[] args) {
        
        String[] fruits= {"banana", "pear", "apple", "grape"};

        for(String fruit: fruits){
            System.out.println(fruit);
        }
        

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int i = 0; i<numbers.length;i++){
            System.out.print("Enter a number: ");
            int inputNumber = scan.nextInt();
            numbers[i] = inputNumber;
        }
        System.out.println("You have entered: ");

        int total = 0;
        for(int integerNumbers: numbers){
            System.out.println(integerNumbers);
            total += integerNumbers;
        }
        System.out.println("Total: "+total);
    }
}