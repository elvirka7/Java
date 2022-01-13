package day35_Encapsulation.dinner_tasks.phone;

public class Phone {

    public String brand, model, size, color;
    public double price;

    public void setInfo(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    //methods
    public void call(long phoneNumber){
        System.out.println("Someone is calling you from " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Someone is texting you from " + phoneNumber);
    }

    public String toString() {
        return "\n Phone details: \n" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + "\n";
    }





}
