package day36_Inheritance.Dinner.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is coding");
    }
}
