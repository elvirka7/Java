package day36_Inheritance.Dinner.employeeTask1;

public class Driver extends Employee{


    public Driver( String name, String jobTitle, int age, int id, int salary) {
        super( name, jobTitle, age, id, salary);
    }

    public void drive(){
        System.out.println(jobTitle+" "+name+" is driving");
    }
}

