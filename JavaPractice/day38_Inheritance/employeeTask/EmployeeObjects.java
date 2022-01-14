package day38_Inheritance.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Ahmad", 26, 'M', 12344, 120000);
        Developer developer = new Developer("Manas", 30, 'M', 12535, 180000);
        Driver driver = new Driver("Mike", 45, 'M', 23523, 70000);
        Pilot pilot = new Pilot("Jamie", 28, 'M', 123244, 110000);
        ProductOwner productOwner = new ProductOwner("Asyl", 35, 'F', 34141, 170000);
        ScrumMaster scrumMaster = new ScrumMaster("Chika", 36, 'F', 32525, 140000);
        Teacher teacher = new Teacher("Caleb", 44, 'M', 85834, 876580000);
        Tester tester = new Tester("Jonny", 27, 'M', 413513, "SDET", 145000);

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(businessAnalyst, developer, driver, pilot, productOwner, scrumMaster, teacher, tester));

        for (Employee each : employeeList) {
            each.work();
        }

        System.out.println(employeeList);
    }
}
