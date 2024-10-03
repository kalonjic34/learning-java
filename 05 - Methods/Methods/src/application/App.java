package application;

public class App {
    /*
     * Methods
     * 
     * Accessing instance Variables
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Chris";
        
        System.out.println(person1.name);
        person1.sayHello();
    }
}