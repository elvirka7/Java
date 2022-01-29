package day39_Recap.deviceTask;

public class Laptop extends Computer{
    public Laptop( String brand, String model, double price) {
        super("Laptop", brand, model, price, true);
    }

    @Override
    public void use(){
        System.out.println(getName() + " is a portable device");
    }
}
