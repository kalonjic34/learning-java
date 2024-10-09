package application;

public class App {
    /*
     * Getters and setters
     * 
     * This
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Chris");
        person1.setAge(24);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
}
