package day37_Inheritance.scrumTeamTask;

public class ProductOwner extends Employee{


    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }


}
