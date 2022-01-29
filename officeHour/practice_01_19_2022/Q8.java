package practice_01_19_2022;

public class Q8 {

    public static void main(String[] args) {
        method2("The sun set quickly and created a shadow");
    }

    public static void method2(String s) {

        String a = s.substring(10);//String a= "t quickly and created a shadow";

        if(a.length() > s.length()){
            System.out.println(a);
        }else{
            System.out.println(s);
        }
    }
}
