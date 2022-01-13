package day20_ArraysREPEAT;

public class MonthArray {
    public static void main(String[] args) {

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i <= month.length-1; i++) {

            System.out.print(month[i]+" ");
        }
        System.out.println("\n===");

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.print(month[i]+" ");
        }
        }
    }

