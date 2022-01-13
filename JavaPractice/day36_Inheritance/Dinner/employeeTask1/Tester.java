package day36_Inheritance.Dinner.employeeTask1;

public class Tester extends Employee {


    public Tester( String name, String jobTitle, int age, int id, int salary) {
        super( name, jobTitle, age, id, salary);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}


