package day34_GarbageCollection_AccessModifiers.muhtar_tasks;

public class Iphone {

    public static String brand, OS, madeIn, designedIn;
    public String model, size, color;
    public double price;
    public static boolean isSmartPhone;

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand="iPhone";
        OS="IOS";
        isSmartPhone=true;
        madeIn="China";
        designedIn="USA";
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }

    public void call(long phoneNumber){
        System.out.println(brand +" "+ model + " is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand +" "+ model + " is texting "+phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand +" "+ model + " is faceTiming "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand +" "+ model + " is faceTiming "+email);
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", OS ='" + OS+ '\'' +
                ", Smart phone='" + isSmartPhone + '\'' +
                ", made in ='" + madeIn + '\'' +
                ", designed in='" + designedIn + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
