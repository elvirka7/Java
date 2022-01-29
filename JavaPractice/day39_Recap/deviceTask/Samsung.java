package day39_Recap.deviceTask;

public class Samsung extends Phone{

    public Samsung( String model, double price) {
        super("Samsung", model, price);
    }

    public void pauseRecord(){
        System.out.println(getBrand()+" allows you to pause while recording");
    }

}
