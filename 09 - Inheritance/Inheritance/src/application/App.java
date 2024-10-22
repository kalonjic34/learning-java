package application;

public class App {
    /*
     * 1. Inheritance
     * 2. Overriding Methods
     */
    public static void main(String[] args) {
        /* 
        Animals animal1 = new Animals();
        animal1.eat();

        Bird bird1 = new Bird();
        bird1.eat();
        bird1.latEgg();
        */

        HouseCat cat1 = new HouseCat();
        cat1.vocalize();
        cat1.hunt();

        Tiger cat2 = new Tiger();
        cat2.vocalize();
        cat2.hunt();
    }
}