package practice_01_19_2022;

public class Q9 {

    public static void main(String[] args) {
         method3(50);
       //System.out.println(method3(50));
    }

    public static String method3(int num) {

        if(num < 0){
            return "Less than 0";
        }else if(num<50){
            return "Less than 50";
        }else if(num < 100){
            return "Less than 100";
        }else{
            return "other";
        }
    }
}
