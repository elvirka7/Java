package day38_Inheritance.employeeTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println("working");
    }

}
