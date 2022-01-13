package day36_Inheritance.Dinner.employeeTask1;

public class EmployeeObjects {
    public static void main(String[] args) {


        Developer developer = new Developer("Grant", "CEO", 34, 007, 123000);
        System.out.println(developer);


        Driver driver = new Driver("Dante", "driver", 45, 234, 230000);
        System.out.println(driver);


        Teacher teacher = new Teacher("Muhtar", "SDET teacher", 34,  004, 500000);
        System.out.println(teacher);

        Tester tester = new Tester("Elvira", "SDET",30, 001, 125000);
        System.out.println(tester);

        System.out.println("__________________");
        developer.fixBugs();
        driver.drive();
        teacher.teach();
        tester.createTicket();
        System.out.println("__________________");

        Employee [] employees = { developer, driver, teacher, tester};
        for (Employee each : employees) {
            each.work();
        }

    }
}