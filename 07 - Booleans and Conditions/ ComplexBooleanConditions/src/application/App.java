package application;

public class App {
    /*
     *  Complex Boolean Conditions
     */
    public static void main(String[] args) {
        //  ==, !=, !, &&, ||

        boolean isRaining = false;
        boolean mightRain = true;
        boolean haveUmbrella = true;

        if((isRaining || mightRain) && haveUmbrella){
            System.out.println("Take umbrella!");
        }else{
            System.out.println("Dont take umbrella");
        }
    }
}