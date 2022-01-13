package day33_Statics.muhtar_tasks;

public class IPhone {
    public String model, color, size;
    public double price;
    public static String brand,  madeIn, OS;

    public IPhone(String model, String color, double price, String size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    static{
        brand = "Apple";
        OS = "iOS" ;
        madeIn = "China";
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" "+color+" "+phoneNumber+" is face timing");
    }
    public void faceTime(String email){
        System.out.println(model+" "+color+" "+email+" is face timing");
    }
    public void call(long phoneNumber){
        System.out.println(model+" "+color+" "+phoneNumber+" is calling");
    }
    public void text(long phoneNumber){
        System.out.println(model+" "+color+" "+phoneNumber+" is texting");
    }
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price='"+ price + '\'' +
                ", brand='"+ brand + '\'' +
                ", OS='"+ OS + '\'' +
                ", made in='"+madeIn +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */