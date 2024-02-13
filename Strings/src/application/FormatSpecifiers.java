package application;

import java.util.Scanner;

public class FormatSpecifiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value in fahrenheit to convert > ");

        double fahrenheit = scan.nextFloat();
        scan.close();

        double celcius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("%.1f degrees fahrenheit is %.2f degrees celcius.",
                fahrenheit, celcius);

    }
}