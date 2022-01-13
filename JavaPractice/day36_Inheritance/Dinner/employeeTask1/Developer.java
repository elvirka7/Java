package day36_Inheritance.Dinner.employeeTask1;

public class Developer extends Employee{


    public Developer( String name, String jobTitle, int age, int id, int salary) {
        super( name, jobTitle, age, id, salary);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}


