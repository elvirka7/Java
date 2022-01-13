package day20_ArraysREPEAT;

public class zTheDinner1_Classmates {
    public static void main(String[] args) {

        String [] classmates = { "Grant Foster", "Elvira Foster", "Kai Foster", "Alia Foster", "Turdubek Aiylchiev", "Kishimjan Tashtakeeva", "Marlen Aiylchiev",
        "Eliza Turdubekova", "Eldar Emilbekov", "Adil Marlenov"};

        for (int i = 0; i < classmates.length; i++) {
            String initial = classmates[i].substring(0,1) + "."+classmates[i].substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2);
            System.out.println(initial);
        }


    }
}
/*
 create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */