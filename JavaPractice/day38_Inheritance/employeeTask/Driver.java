package day38_Inheritance.employeeTask;

public class Driver extends Employee {

    public Driver(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Driver", salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is driving");
    }
}
