package day36_Inheritance.Dinner.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void grooming(){
        System.out.println(name+" is grooming the product backlog");
    }
}
