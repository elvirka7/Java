package day36_Inheritance.Dinner.scrumTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String jobTitle, String companyName) {
        super(name, age, gender,"Business Analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }
}
