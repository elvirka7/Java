package day33_Statics.muhtar_tasks;

public class IPhoneObjects {
        public static void main(String[] args) {
            IPhone phone = new IPhone("iPhone 13", "white", 1100, "medium");
            System.out.println(phone);
            phone.faceTime(1454656543);
            phone.faceTime("phone@gmail.com");
            phone.call(1673556543);
            phone.text(1874656543);
        }
    }
