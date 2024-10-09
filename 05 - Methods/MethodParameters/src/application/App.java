package application;

public class App {
    /*
     * Method paramaters
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int squared = calc.square(8);
        
        System.out.println(squared);
    }
}