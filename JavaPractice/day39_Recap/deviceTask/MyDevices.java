package day39_Recap.deviceTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyDevices {
    public static void main(String[] args) {

        Blackberry blackberry = new Blackberry("Aurora", 900.00);
        Google googlePhone = new Google("Pixel 6 Pro", 999.00);
        Iphone iphone = new Iphone("SE", 399.00);
        Nokia nokia = new Nokia("Nokia 225", 49.99);
        Samsung samsung = new Samsung("Galaxy A12", 179.99);

        Desktop desktop = new Desktop("HP", "Elite One", 1629);
        Laptop laptop = new Laptop("HP", "Envy", 899.00);
        PersonalComputer personalComputer = new PersonalComputer("HP", "Envy", 899.99, true);

        TV tv = new TV("LG","Series 50", 389.99);

        System.out.println("METHODS THAT ARE COMMONG BETWEEN ALL DEVICES");
        ArrayList<Device> myDeviceList = new ArrayList<>(Arrays.asList(blackberry, googlePhone, iphone, nokia, samsung, desktop, laptop, personalComputer));
        for (Device device : myDeviceList) {
            device.turnOn();
            device.turnOff();
        }

        System.out.println("\n\nCOMMON METHODS OF PHONE DEVICES");
        ArrayList<Phone> phoneList = new ArrayList<>(Arrays.asList(iphone,samsung,blackberry,googlePhone,nokia));
        for (Phone phone : phoneList) {
            phone.call(111_111_1111);
            phone.text(111_111_1111);
        }

        System.out.println("\n\nCOMMON METHODS OF COMPUTER DEVICES");
        ArrayList<Computer> computerList = new ArrayList<>(Arrays.asList(personalComputer,desktop,laptop));
        for (Computer computer : computerList) {
            computer.use();
        }


        System.out.println("\n\nINDIVIDUAL METHODS OF EACH DEVICE");
        blackberry.keyboard();
        googlePhone.OS();
        iphone.facetime();
        nokia.brick();
        samsung.pauseRecord();
        tv.channelUp();
        tv.channelDown();


        System.out.println("\n\nFULL DETAILS OF MY DEVICES");
        System.out.println(myDeviceList);

        System.out.println("\n\nTOTAL COST OF MY DEVICES");
        double totalPrice = 0;
        for (Device device : myDeviceList) {
            totalPrice+=device.getPrice();
        }
        System.out.println(totalPrice);

    }
}
