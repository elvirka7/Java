package day38_Inheritance.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" is taking scrum team out for happy hour");
    }
}
