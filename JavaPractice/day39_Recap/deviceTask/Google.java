package day39_Recap.deviceTask;

public class Google extends Phone{
    public Google(String model, double price) {
        super("Google", model, price);
    }

    public void OS(){
        System.out.println(getBrand()+" uses Fuchsia OS");
    }
}
