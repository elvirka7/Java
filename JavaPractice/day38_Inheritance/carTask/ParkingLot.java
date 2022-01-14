package day38_Inheritance.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);

        Audi audi = new Audi("Basics", 2020, 10000, "Black", 123456);


        ArrayList<Car> parkedOnParkingLot = new ArrayList<>(Arrays.asList(toyota, tesla, bmw, audi));

        for (Car car : parkedOnParkingLot) {
            car.start();
            car.drive();
        }

        System.out.println("_______________________");
        bmw.racing();
        bmw.breaksDown();
        toyota.reliable();


    }

}
