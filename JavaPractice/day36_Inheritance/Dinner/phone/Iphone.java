package day36_Inheritance.Dinner.phone;

public class Iphone extends Phone {


    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling you to FaceTime");
    }

    public void faceTime(String email){
        System.out.println(email + " is calling you to Facetime");
    }


}