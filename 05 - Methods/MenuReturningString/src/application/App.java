package application;

public class App {
    /*
     * Menu returning string
     */
    public static void main(String[] args) {
        Menu optionsMenu = new Menu();

        String menuText  = optionsMenu.getMenu();
        System.out.println(menuText);
    }
    
}