package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {
    /*
     * 1. Inheritance
     * 2. Overriding Methods
     * 3. The Override Annotation
     * 4. Subtype Polymorphism
     * 5. Casting and Runtime Errors
     * 6. Protected
     */
    public static void main(String[] args) {

        /* 
        Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};

        for(Cat cat: cats){
            cat.vocalize();
            cat.hunt();
        }
        

        Cat cat1 = new HouseCat();
        cat1.hunt();
        cat1.vocalize();
        
        // Does not work
        // cat1.purr();
        // ((HouseCat)cat1).purr();
        System.out.println();

        HouseCat cat2 = new HouseCat();
        cat2.hunt();
        cat2.vocalize();
        cat2.purr();
        */

        Fruit fruit1 = new Apple();
        System.out.println(fruit1);

        Fruit fruit2 = new Banana();
        System.out.println(fruit2);

    }
}