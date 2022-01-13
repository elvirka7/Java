package day31_Constructors.Dinner;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;

    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * (stateTaxRate/100);
    }

    public double federalTax() {
        return salary() * (federalTaxRate/100);
    }

    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "SalaryCalculator( \nSalary: $" + salary() +
                "\nState Tax: $" + stateTax() +
                "\nFederal Tax: $" + federalTax() +
                "\nSalary After Tax: $" + salaryAfterTax()+")";
    }
}
/*
SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */