package application;

public class App {
    public static void main(String[] args) {
        /*
         * Select an option:
         * 1. Add an entry
         * 2. View the database
         * 3. Exit
         */

        String prompt = "Select an option:";
        String addEntry = "Add an entry";
        String viewDatabase = "View the database";
        String exit = "Exit";

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        String menu = "\t" + prompt + "\n";
        menu += "\t\t" + value1 + ". " + addEntry + "\n";
        menu += "\t\t" + value2 + ". " + viewDatabase + "\n";
        menu += "\t\t" + value3 + ". " + exit + "\n";

        System.out.println(menu);
    }
}