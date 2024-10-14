package application;

public class App {
    /*
     * Static and Final
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Jamie");

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(Cat.FOOD);
    }
}