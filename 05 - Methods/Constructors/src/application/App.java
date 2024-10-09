package application;

public class App {
    /*
     * 1. Constructors
     * 
     * 2. Constructors with parameters
     */
    public static void main(String[] args) {
        Person person1 = new Person("Chris", 180.0);
        Person person2 = new Person("Sam", 160.5);
        Person person3 = new Person();


        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        System.out.println(person2.getName());
        System.out.println(person2.getHeight());

        System.out.println(person3.getName());
        System.out.println(person3.getHeight());
    }
    
}