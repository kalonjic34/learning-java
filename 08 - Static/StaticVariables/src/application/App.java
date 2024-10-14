package application;

public class App {
    /*
     * Static Variables
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Jamie");
        Cat cat3 = new Cat("James");

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(Cat.FOOD);

        System.out.println(cat1.getCount());
    }
}