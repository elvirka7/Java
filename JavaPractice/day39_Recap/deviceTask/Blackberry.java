package day39_Recap.deviceTask;

public class Blackberry extends Phone{
    public Blackberry( String model, double price) {
        super("Blackberry", model, price);
    }

    public void keyboard(){
        System.out.println(getBrand() +" keyboard is not touchscreen");
    }
}
