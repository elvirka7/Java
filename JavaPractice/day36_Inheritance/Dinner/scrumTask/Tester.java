package day36_Inheritance.Dinner.scrumTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + "is creating ticket");

    }
}