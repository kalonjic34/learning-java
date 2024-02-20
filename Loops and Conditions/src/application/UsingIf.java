package application;

import java.util.Scanner;

public class UsingIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter room tempreture (F) > ");

        double tempretureFahreinheit = scan.nextFloat();
        scan.close();
        double tempretureCelsius = (tempretureFahreinheit - 32) * (5.0 / 9.0);

        System.out.printf("Temperture celsisus: %.2f\n", tempretureCelsius);

        // if (tempretureCelsius < 21) {
        // System.out.println("Too cold");
        // }
        // if (tempretureCelsius > 21) {
        // System.out.println("Warm enough");
        // }

        if (tempretureCelsius < 21) {
            System.out.println("Too cold!");
        } else {
            System.out.println("Warm enough");
        }
    }
}