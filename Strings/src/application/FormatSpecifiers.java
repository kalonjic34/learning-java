package application;

public class FormatSpecifiers {
    public static void main(String[] args) {
        double fahrenheit = 91;

        double celcius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("%.1f degrees fahrenheit is %.2f degrees celcius.", fahrenheit, celcius);

        // double value = 1.2343634;
        // System.out.printf("Hello %.2f\n", value);
        // System.out.printf("Hello %d\n", 123);
        // System.out.printf("%s %d \n", "hello", 123);
    }
}