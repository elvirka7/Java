package day39_Recap.deviceTask;

public class Computer extends Device{

    public Computer(String name, String brand, String model, double price, boolean hasBattery) {
        super(name, brand, model, price, hasBattery);
    }

    public void use(){
        System.out.println(getName()+" is used for data processing");
    }
}

