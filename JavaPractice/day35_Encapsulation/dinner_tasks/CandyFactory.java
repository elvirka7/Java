package day35_Encapsulation.dinner_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Mars", 5, 2, true);
        Candy candy2 = new Candy("Snickers", 4, 3, false);
        Candy candy3 = new Candy("M&M", 10, 1.5, false);
        Candy candy4 = new Candy("Bounty", 3, 4, true);
        Candy candy5 = new Candy("Skittles", 20, 3, false);

        System.out.println(candy1);
        ArrayList<Candy> candies = new ArrayList<>();

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy each : candies) {
            System.out.println(each.getBrand() + " - " + each.getPrice());
        }


    }
}
