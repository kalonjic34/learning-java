package application;

public class App {
    /*
     *  Instance variables
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Chris";
        person1.age = 24;

        person2.name = "Sam";
        person2.age = 23;

        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}