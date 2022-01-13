package day11_Switch_Scanner;

public class CappucinoByer_ifAndSwitch {
    public static void main(String[] args) {

        String size = "Grande",
                tall = "Price is $3.69\n90 calories",
                grande = "Price is $3.99\n120 calories",
                venti = "Price is $4.29\n150 calories",
                invalid = "Invalid size",
                result = "";


        if (size == "Tall" || size == "Grande" || size == "Venti") {
            switch (size) {
                case "Tall":
                    result = tall;
                    break;
                case "Venti":
                    result = venti;
                    break;
                default:
                    result = grande;

            }
        } else {
            result = "Invalid size";
        }
        System.out.println("Size: " + size + "\n" + result);
    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"
 */