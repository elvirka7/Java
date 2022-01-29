package practice_01_19_2022;

public class Q13 {

    public static void main(String[] args) {
        String str = method7("on the weekend", 20);
        System.out.println(str);
    }

    public static String method7(String str, int s) {

        str = str.substring(6); // str = " weekend";

        if(s < 10){
            str = str.substring(8);
        }else{
            if(str.length() > s){
                str = "weekday";
            }else if(s > 10 || s == -10) {
                str = str.substring(5);// str="end";
            }
        }

        return str;
    }
}
