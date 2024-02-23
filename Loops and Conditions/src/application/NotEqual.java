package application;

public class NotEqual {
    public static void main(String[] args) {

        int value1 = 4;
        int value2 = 3;

        if (value1 != value2) {
            System.out.println("Values are not equal");
        }

        String fruit1 = "Orange";
        String fruit2 = "Apple";

        if (!fruit1.equals(fruit2)) {
            System.out.println("Fruits are not the same");
        }

        // Not needed really
        if (fruit1.equals(fruit2) != true) {
            System.out.println("Fruits are not the same");
        }
        System.out.println(fruit1.equals(fruit2));
        System.out.println(fruit1.equals(fruit2) == true);

    }
}