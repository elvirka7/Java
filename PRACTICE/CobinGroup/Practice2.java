package CobinGroup;

public class Practice2 {

public static boolean canPlay(int temperature, boolean isSummer){
    boolean result = ((temperature>=60 && temperature<=90))||(temperature>=60 && temperature<=100 && isSummer)? true : false;
        return result;
}

    public static void main(String[] args) {
        System.out.println(canPlay(70, false));  //returns true
        System.out.println(canPlay(95, false));  //returns false
        System.out.println(canPlay(95, true));   //returns true

}

}
