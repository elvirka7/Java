package day39_Recap.scrumTeamTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Developer", salary);
    }

    public void fixBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is crying");
    }
}
