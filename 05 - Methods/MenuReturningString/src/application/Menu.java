package application;

public class Menu {
    String[] options = {
        "Add an Item",
        "View items",
        "Delete an item",
        "Quit the program"
    };

    String getMenu(){

        String menuText = "Choose an option:\n";

        for(int i = 0; i < options.length;i++){
            menuText += " " +i+". "+options[i] + "\n";
        }

        return menuText;
    }
}