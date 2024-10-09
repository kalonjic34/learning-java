package application;

public class App {
    /*
     * Constructors
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Chris");
        person1.setHeight(180.0);

        Person person2 = new Person();
        person2.setName("Sam");
        person2.setHeight(160.5);

        Person person3 = new Person();


        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        System.out.println(person2.getName());
        System.out.println(person2.getHeight());

        System.out.println(person3.getName());
        System.out.println(person3.getHeight());
    }
    
}