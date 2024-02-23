package application;

public class Not {
    public static void main(String[] args) {

        System.out.println(!(4 == 5));

        int value1 = 4;
        int value2 = 3;

        if (!(value1 == value2)) {
            System.out.println("Values are not equal");
        }
    }
}