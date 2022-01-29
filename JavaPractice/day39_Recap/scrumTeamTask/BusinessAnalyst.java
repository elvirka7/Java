package day39_Recap.scrumTeamTask;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    public void analyze(){
        System.out.println(getName()+ " is analyzing the documents");
    }
}
