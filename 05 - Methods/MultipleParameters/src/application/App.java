package application;

public class App {
    /*
     * Multiple parameters
     */
    public static void main(String[] args) {
        final int toSquare = 11;

        Calculator calc = new Calculator();

        int squared = calc.square(toSquare);
        System.out.println(toSquare+" squared is: "+squared);
    
        int added = calc.add(7,5);
        System.out.println("7 + 5 is: "+added);
    }
}