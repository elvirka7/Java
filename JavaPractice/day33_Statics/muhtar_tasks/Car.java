package day33_Statics.muhtar_tasks;

public class Car {
    public String make, model, color;
    public int year, price;
    public static int numberOfWheels = 4;
    public static boolean hasBattery = true, hasSeats = true;

    public Car(String make, String model, String color, int year, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public static void drive(){
        System.out.println("Car can drive");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year + '\'' +
                ", price=" + price +
                ", number of wheels=" + numberOfWheels +
                ", has batter=" + hasBattery +
                ", has seats=" + hasSeats +
                '}';
    }
}
/*

7. Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()

 */