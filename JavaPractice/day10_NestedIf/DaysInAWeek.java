package day10_NestedIf;

public class DaysInAWeek {
    public static void main(String[] args) {
        int n = 7;

        String day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : (n==7)? "Sunday" : "Invalid week day" ;


        System.out.println(day);
        System.out.println("Say Hi to Lena :-) ");
    }
}
