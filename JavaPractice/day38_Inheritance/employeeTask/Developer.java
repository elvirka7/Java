package day38_Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working on unit testing");
    }
}
