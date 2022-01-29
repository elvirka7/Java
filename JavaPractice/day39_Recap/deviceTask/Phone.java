package day39_Recap.deviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, double price) {
        super("Phone", brand, model, price, true);
    }

    public void call(long phoneNum){
        System.out.println(getName()+" "+ getBrand()+" "+getModel()+" is calling from "+phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getName()+" "+ getBrand()+" "+getModel()+" is texting from "+phoneNum);
    }

}
