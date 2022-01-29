package day39_Recap.deviceTask;

public class Iphone extends Phone{
    public Iphone( String model, double price) {
        super("Iphone", model, price);
    }

    public void facetime(){
        System.out.println(getBrand()+" is able to facetime");
    }

}
