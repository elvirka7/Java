package day36_Inheritance.Dinner.employeeTask2;

public class Developer extends Employee {


    public void coding() {
        System.out.println(jobTitle + " " + name + " is coding");
    }

    public void fixingBugs() {
        System.out.println(jobTitle + " " + name + " is fixing bugs");
    }
}


