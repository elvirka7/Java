package day22_MultiDimensionalArray;

public class ZTheDinner2_PrintOutput {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] bags: items) {
            System.out.println();
            for (String contents : bags) {

                System.out.print(contents+"\t");
            }
        }
        System.out.println("\n----------------------------------------------------------");


        for (String[] bags : items) {
            System.out.println();
            for (int i = 0, j=bags.length-1; i < bags.length; i++, j--) {

                System.out.print(bags[j]+"\t");
            }
            }
        System.out.println("\n----------------------------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
        }
        }

        }








