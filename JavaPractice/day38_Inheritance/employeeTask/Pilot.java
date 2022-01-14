package day38_Inheritance.employeeTask;

public class Pilot extends Employee{


    public Pilot(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Pilot", salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " is flying my family to Hawaii");
    }
}
