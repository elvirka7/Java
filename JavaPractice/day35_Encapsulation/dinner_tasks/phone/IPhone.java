package day35_Encapsulation.dinner_tasks.phone;

public class IPhone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling you to FaceTime");
    }

    public void faceTime(String email){
        System.out.println(email + " is calling you to Facetime");
    }

}