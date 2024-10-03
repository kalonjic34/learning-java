package application;

public class Menu {
    String[] menu = {
        "View database",
        "Add new item",
        "Delete item",
        "Quit program"
    };
    void display(){
        System.out.println("Choose an option:");
        for(int i = 0; i < menu.length;i++){
            System.out.println("\t"+i+". "+menu[i]);
        }
    }
}