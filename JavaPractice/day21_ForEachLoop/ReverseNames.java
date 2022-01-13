package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Grant Foster", "Elvira Foster", "Kai Foster", "Alia Foster", "Turdubek Aiylchiev", "Kishimjan Tashtakeeva", "Marlen Aiylchiev",
                "Eliza Turdubekova", "Eldar Emilbekov", "Adil Marlenov"};

        for (String each : names) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
        

    }
}
