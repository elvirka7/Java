package _2_Statements;

import java.util.Scanner;

public class _22_GiftCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        sc.close();

        String result = "";

        int giftcard = 100;
        int price = 0;
        boolean isValidItem = true;


        switch (item) {
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 15;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USB cable":
                price = 10;
                break;
            default:
                isValidItem = false;
        }

        if (isValidItem) {
            if (price > giftcard) {
                result = "Sorry, not enough funds on your gift card!";
            } else {
                int leftOverBalance = giftcard - price;
                result = "Thank you for your purchase!\nYour current balance is: " + leftOverBalance + "$";
            }


        } else {
            result = "Invalid item!";
        }
        System.out.println(result);

    }
}

/*
Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */