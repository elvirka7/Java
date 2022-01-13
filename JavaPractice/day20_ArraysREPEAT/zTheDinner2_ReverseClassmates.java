package day20_ArraysREPEAT;

public class zTheDinner2_ReverseClassmates {
    public static void main(String[] args) {

        String [] classmates =  { "Grant Foster", "Elvira Foster", "Kai Foster", "Alia Foster", "Turdubek Aiylchiev", "Kishimjan Tashtakeeva", "Marlen Aiylchiev",
                "Eliza Turdubekova", "Eldar Emilbekov", "Adil Marlenov"};

        for (int i = 0; i < classmates.length; i++) {

            System.out.println();
            for (int j = classmates[i].length()-1 ; j >= 0 ; j--) {
                System.out.print(classmates[i].charAt(j));
            }
        }
    }
}
/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */