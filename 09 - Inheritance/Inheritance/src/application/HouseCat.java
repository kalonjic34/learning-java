package application;

public class HouseCat extends Cat{

    @Override
    public void vocalize(){
        System.out.println("Meow!!");
    }

    public void purr(){
        System.out.println("Purr!!");
    }
}