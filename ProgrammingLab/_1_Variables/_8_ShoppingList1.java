package _1_Variables;

import java.util.Scanner;

public class _8_ShoppingList1 {
    public static void main(String[] args) {

        //Declare 4 String variables: item1, item2, item3, report
        String item1, item2, item3, report;

        //Declare 4 double variables: price1, price2, price3, totalPrice

        double price1, price2, price3, totalPrice;
        Scanner scan = new Scanner(System.in);

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();


        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();


        // CONTINUE WRITE YOUR CODE BELOW THIS LINE:
        totalPrice = price1+price2+price3;
        report =  "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);

        scan.close();
      //  Output:
        //Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
        // Total price: 15.3

    }
}
/*
In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:
Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
 */