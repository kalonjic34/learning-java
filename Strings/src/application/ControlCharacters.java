package application;

public class ControlCharacters {
    public static void main(String[] args) {
        // String text = "\tTo be or not to be.\n\tThat is the question";

        // System.out.println(text);

        /*
         * Select an option:
         * 1. Add an entry
         * 2. View the database
         * 3. Exit
         */

        int one = 1;
        int two = 2;
        int three = 3;

        String menu_text = "\tSelect an option:\n\t\t" + one + ". Add an entry\n\t\t" + two
                + ". View the database\n\t\t"
                + three
                + ". Exit";
        System.out.println(menu_text);

    }
}