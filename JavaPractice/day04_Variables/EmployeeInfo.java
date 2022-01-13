package day04_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String employeeName = "Grant";
        int age = 37,
                salary = 170_000;
        char gender = 'M';
        String company = "Google, Inc",
                jobTitle = "President",
                employeeId = "A008",
                SSN = "(111)-11-1111";
        double yearsOfExperience = 5.5;
        boolean isFullTime = true,
                isMarried = false;

        System.out.println("Employee Name = " + employeeName +
                "\nEmployee Id = " + employeeId +
                "\nGender = " + gender +
                "\nAge = " + age +
                "\nJob Title = " + jobTitle +
                "\nCompany = " + company +
                "\nears Of Experience = " + yearsOfExperience +
                "\nFullTime = " + isFullTime +
                "\nSalary = " + salary +
                "\nMarried = " + isMarried +
                "\nSSN = " + SSN);

    }
}
/*
6. Create a class employeeNamed EmployeeInfo. declare the following variables:
				1. employeeName (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExperience (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
 */