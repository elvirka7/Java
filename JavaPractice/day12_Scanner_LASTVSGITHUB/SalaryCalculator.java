package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly rate");
        int hourlyRate = input.nextInt();

        System.out.println("Please enter your weekly hours worked");
        int weeklyHours = input.nextInt();

        System.out.println("Please enter state tax rate");
        int stateTaxRate = input.nextInt();

        System.out.println("Please enter federal tax rate");
        int federalTaxRate = input.nextInt();

        input.close();

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int stateTax = salaryBeforeTax * stateTaxRate / 100;
        int federalTax = salaryBeforeTax * federalTaxRate / 100;
        int totalTaxedAmount = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - totalTaxedAmount;

        System.out.println("Gross pay is: $" + (int) salaryBeforeTax +
                "\nFederal tax is: $" + (int) federalTax +
                "\nState tax is: $" + (int) stateTax +
                "\nTotal taxed amount is: $" + (int) totalTaxedAmount +
                "\nNet income is: $" + (int) salaryAfterTax);

    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */