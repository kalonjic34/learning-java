package application;

public class Equality {
    public static void main(String[] args) {

        int cats = 42;
        int dogs = 23;
        int weazel = 42;

        boolean more_cats_than_dogs = cats > dogs;

        System.out.println("More cats than dogs " + more_cats_than_dogs);

        System.out.printf("Same number of cats and weazels: %b\n", cats == weazel);
        System.out.printf("Same number of cats and weazels: %b\n", cats == dogs);

        System.out.printf("Number of cats greater than number of weazels: %b\n", cats > weazel);
    }
}