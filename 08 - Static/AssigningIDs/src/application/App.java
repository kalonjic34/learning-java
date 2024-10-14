package application;

public class App {
    /*
     * 1.Assigning IDs
     * 
     * 2. Static Initialization Blocks
     */
    public static void main(String[] args) {

        final String CAT_FORMAT_STR = "Count of cats: %d\n";

        String catCount = String.format("Count of cats: %d\n", Cat.getCount());
        System.out.println(catCount);

        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Jamie");
        Cat cat3 = new Cat("James");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println(Cat.FOOD);

        System.out.println(Cat.getCount());

        catCount = String.format(CAT_FORMAT_STR, Cat.getCount());
        System.out.println(catCount);
    }
}
