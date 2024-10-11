package test;

public class Test {
    /*
     * Char type
     */
    public static void main(String[] args) {
        
        char c1 = 'A';
        char c2 = 'A';

        System.out.println(c1);

        System.out.println(c1 == c2);

        char c3 = '\u0000';
        System.out.println("'" +c3+"'");

        char c4 = '\u261F';
        System.out.println("'" +c4+"'");

        char c5 = '\u00A9';
        System.out.println("'" +c5+"'");

        char c6 = 65;
        System.out.println("'" +c6+"'");
    }
}