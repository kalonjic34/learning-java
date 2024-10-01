package application;

public class App {
    /*
     * Do while loop
     */
    public static void main(String[] args) {

        int count = 0;

        System.out.println("First loop");

        do {
            System.out.println("Count: "+count);
            count++;
        }
        while(count++ < 10);
         
        count = 0;

        System.out.println("\nSecond loop");

        do {
            System.out.println("Count: "+count);
            count++;
        }
        while(count < 3);
    }
}