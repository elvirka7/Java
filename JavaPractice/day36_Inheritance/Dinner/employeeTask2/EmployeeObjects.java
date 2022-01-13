package day36_Inheritance.Dinner.employeeTask2;

public class EmployeeObjects {
    public static void main(String[] args) {


        Developer developer = new Developer();
        developer.setInfo("Grant", 'M', 35, 0021, "back end developer", 630000);
        System.out.println(developer);


        Driver driver = new Driver();
        driver.setInfo("Dante", 'M', 56, 0003, "driver", 125000);
        System.out.println(driver);


        Teacher teacher = new Teacher();
        teacher.setInfo("Muhtar", 'M', 32, 0001, "SDET teacher", 230000);
        System.out.println(teacher);

        Tester tester = new Tester();
        teacher.setInfo("Elvira", 'F', 37, 007, "SDET", 100000);
        System.out.println(tester);

        System.out.println("__________________");
        developer.coding();
        developer.fixingBugs();
        tester.testing();
        tester.creatingTicket();
        driver.delivering();
        teacher.teaching();
        System.out.println("__________________");

        Employee[] employees = {developer, tester, teacher, driver};
        for (Employee each : employees) {
            each.work();
        }

    }
}