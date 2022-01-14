package day38_Inheritance.carTask;

public class Tesla extends Car {


    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition "+brand +" "+model);
    }
}
