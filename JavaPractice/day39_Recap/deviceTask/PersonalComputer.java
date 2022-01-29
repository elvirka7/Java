package day39_Recap.deviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer( String brand, String model, double price, boolean hasBattery) {
        super("Personal computer", brand, model, price, hasBattery);
    }


     @Override
    public void use(){
        System.out.println(getName() + " is used for personal use");
    }
}
