package day38_Inheritance.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Product Owner", salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle +" is grooming the product backlog");
    }
}
