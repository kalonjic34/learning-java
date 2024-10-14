package application;

public class App {
    /*
     * 1. Boolean "Or"
     */
    public static void main(String[] args) {
        //  ==, !=, !, &&, ||

        boolean isRaining = true;
        boolean mightRain = false;
        boolean takeUmbrella = false;

        if(isRaining || mightRain){
            takeUmbrella = true;
        }

        takeUmbrella = isRaining || mightRain;


        System.out.println(takeUmbrella);

    }
}