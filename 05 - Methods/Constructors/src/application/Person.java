package application;

public class Person {
    private String name;
    private double height;
    

    public Person() {
        name = "?";
        height = 0.0;
        System.out.println("Created a person!");
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}