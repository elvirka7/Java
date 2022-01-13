package day24_CustomMethods_Return;

public class BreakfastTasks1to5_VoidMethods {
    public static void main(String[] args) {

        initials("Elvira", "Foster");
        domain("elvirafoster@gmail.com");
        nameOfMonth(5);
        nameOfDay(0);
        daysInMonth(13);
    }

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    public static void nameOfMonth(int n) {
        String name = "";

        if(n >= 1 && n <= 12){

            name = (n==1)?"Jan" :(n==2)?"Feb" :(n==3)?"Mar" :(n==4)?"Apr" :(n==5)?"May"
                    :(n==6)?"Jun" :(n==7)?"Jul" :(n==8)?"Aug" :(n==9)?"Sep" :(n==10)?"Oct"
                    :(n==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }
    public static void nameOfDay(int n) {
        String day = "";
        if (n >= 1 && n <= 7) {
            day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "Friday"
                    : (n == 6) ? "Saturday" : "Sunday";
        } else {
            day = "Invalid";
        }
        System.out.println("Day of the week: " + day);
    }
    public static void daysInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Month " + month + " has 31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Month " + month + " has 30 days");
        } else if (month == 2) {
            System.out.println("Month " + month + " has 28 days");
        } else {
            System.out.println("Month number can only be 1 to 12");
        }

    }
}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */