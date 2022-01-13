package day20_ArraysREPEAT;

public class zTheDinner3_ShoppingItem<firstIndexOfGloves, iPadisContained> {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        // index number of Gloves and contains iPad
        for (int i = 0; i < items.length; i++) {
            String eachItem = items[i];
            if (eachItem.contains("Gloves")) {
                System.out.println("\nFirst index number of \"Gloves\" is: " + i);
            }
            if (eachItem.contains("iPad")) {
                System.out.println("Item list contains \"iPad\"\n");
            }
        }

            // item list with prices and IDs
            for (int j = 0; j < items.length; j++) {
                String result =   items[j]+" - $"+ prices[j]+" - #"+itemIDs[j];
                System.out.println(result);
            }



    }
}



/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */