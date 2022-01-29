package day39_Recap.deviceTask;

public class Desktop extends Computer{
    public Desktop( String brand, String model, double price) {
        super("Desktop", brand, model, price, false);
    }

    @Override
    public void use(){
        System.out.println(getName() + " cannot be used as portable device");
    }
}
