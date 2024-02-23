package application;

import java.util.Scanner;

public class PrimativeArrays {
    public static void main(String[] args) {
        int[] number = new int[3];

        number[0] = 5;
        number[1] = 123;
        number[2] = 3;

        // for (int i = 0; i < 3; i++) {
        // System.out.println(number[i]);
        // }

        // System.out.println(number.length);

        final int NUM_VALUES = 3;

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[NUM_VALUES];

        for (int i = 0; i < 3; i++) {
            System.out.print(">: ");

            int input_num = scan.nextInt();
            number[i] = input_num;
        }
        scan.close();

        System.out.println("You entered: ");

        int total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);

            total += number[i];
        }
        System.out.println("Total: " + total);
    }
}