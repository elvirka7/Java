package day21_ForEachLoop;

public class InitialsOfClassmates {
    public static void main(String[] args) {

        String [] names = { "Grant Foster", "Elvira Foster", "Kai Foster", "Alia Foster", "Turdubek Aiylchiev", "Kishimjan Tashtakeeva", "Marlen Aiylchiev",
                "Eliza Turdubekova", "Eldar Emilbekov", "Adil Marlenov"};

        for(String each: names){
            String initial = each.charAt(0) +"."+each.substring(each.indexOf(" ")+1, each.indexOf(" ")+2);
            System.out.println(initial);
        }

    }
}
/*
Print initials of each student
 */