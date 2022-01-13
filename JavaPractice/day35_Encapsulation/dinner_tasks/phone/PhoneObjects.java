package day35_Encapsulation.dinner_tasks.phone;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneObjects {

    public static void main(String[] args) {

        IPhone AizadasPhone = new IPhone();
        //int    x          = 2;
        //Scanner scan = new Scanner(System.in);
        AizadasPhone.setInfo("iPhone", "XE", "medium", "gray", 399 );
        AizadasPhone.faceTime(123456789);
        AizadasPhone.faceTime("abc@gmail.com");
        AizadasPhone.text(1234455);
        AizadasPhone.call(12345566);

        System.out.println("-------------------------------------");

        Samsung JamiesPhone = new Samsung();
        JamiesPhone.setInfo("Samsung", "S6", "Large", "Blue", 799);
        JamiesPhone.call(1234456);
        JamiesPhone.text(12324234);
        JamiesPhone.freeze();

        System.out.println("-------------------------------------");

        Nokia CalebsPhone = new Nokia();
        CalebsPhone.setInfo("Nokia", "10K", "Small", "Black", 99);
        CalebsPhone.selfDefense();
        CalebsPhone.call(1234455);
        CalebsPhone.text(1234566);

        System.out.println("-------------------------------------");

        //String brand, String model, String size, String color, double price
        System.out.println(AizadasPhone);
        System.out.println(JamiesPhone);
        System.out.println(CalebsPhone);

        System.out.println("--------------------------------------");

        Phone[] familyPhones = {AizadasPhone, JamiesPhone, CalebsPhone};

        /*familyPhones[0] = AizadasPhone;
        familyPhones[1] = JamiesPhone;
        familyPhones[2] = CalebsPhone;
         */
        System.out.println(Arrays.toString(familyPhones));

        System.out.println("--------------------------------------");

        ArrayList<Phone> familyPhones2 = new ArrayList<>();
        familyPhones2.addAll(Arrays.asList(AizadasPhone, JamiesPhone, CalebsPhone));
        System.out.println("familyPhones2 = " + familyPhones2);

        System.out.println("--------------------------------------");

        System.out.println(AizadasPhone.price);

        System.out.println("--------------------------------------");

        for (Phone each : familyPhones2) {
            System.out.println(each.price);
        }

    }

}