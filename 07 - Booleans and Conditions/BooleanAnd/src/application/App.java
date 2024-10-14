package application;

public class App {
    /*
     * 1. Boolean "And"
     */
    public static void main(String[] args) {
        //  ==, !=, !, &&, ||

        boolean isRaining = true;
        boolean haveUmbrella = false;

        boolean takeUmbrella = false;;

        if(isRaining){
            if (haveUmbrella) {
                takeUmbrella = true;
            }
        }

        if(isRaining && haveUmbrella){
            takeUmbrella = true;
        }

        System.out.println(takeUmbrella);

        takeUmbrella = isRaining && haveUmbrella ? true:false;
    }
}