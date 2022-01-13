package day30_CustomClass;

public class Car {

    //INSTANCE ATTRIBUTES
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    //CUSTOM SETINFO METHOD INSTEAD OF CALLING EACH ATTRIBUTE SEPARATELY LATER
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    //TOSTRING METHOD FOR PRINTING OBJECT ATTRIBUTES
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    //OBJECT'S METHODS
    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }

    public void start() {
        System.out.println(brand + " " + model + " has started");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped");
    }

}
