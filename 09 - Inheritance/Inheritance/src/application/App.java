package application;

public class App {
    /*
     * 1. Inheritance
     * 2. Overriding Methods
     * 3. The Override Annotation
     * 4. Subtype Polymorphism
     */
    public static void main(String[] args) {

        Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};

        for(Cat cat: cats){
            cat.vocalize();
            cat.hunt();
        }
    }
}