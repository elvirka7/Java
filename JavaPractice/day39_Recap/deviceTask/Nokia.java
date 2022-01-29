package day39_Recap.deviceTask;

public class Nokia extends Phone{
    public Nokia(String model, double price) {
        super("Phone", model, price);
    }

    public void brick(){
        System.out.println(getBrand()+" phones look like a brick");
    }
}
