package application;

public class App {
    /*
     * Inheritance 
     */
    public static void main(String[] args) {
        Animals animal1 = new Animals();
        animal1.eat();

        Bird bird1 = new Bird();
        bird1.eat();
        bird1.latEgg();
    }
}