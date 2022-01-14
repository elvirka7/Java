package day38_Inheritance.employeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is testing the application");
    }

}
