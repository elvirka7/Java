package day39_Recap.deviceTask;

public class TV extends Device{
    public TV( String brand, String model, double price) {
        super("TV", brand, model, price, false);
    }

    public void channelUp(){
        System.out.println(getName()+ " turns the channel up");
    }

    public void channelDown(){
        System.out.println(getName()+ " turns the channel down");
    }
}
