package application;

import java.util.Scanner;

/*
 * User input
 */

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value in fahrenheit to convert > ");

        double fahrenheit = scan.nextFloat();
        scan.close();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees celsius.\n", fahrenheit, celsius);
    }
}