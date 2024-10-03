package application;

class Person{
    String name;

}

public class App {
    /*
     * Classes and objects
     */
    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.name = "Chris";

        Person person2 = new Person();
        person2.name = "Sam";

        System.out.println(person1.name);
        System.out.println(person2.name);

    }
}