package day36_Inheritance.Dinner.employeeTask1;

public class Teacher extends Employee {


    public Teacher( String name, String jobTitle, int age, int id, int salary) {
        super( name, jobTitle, age, id, salary);
    }

    public void teach(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }
}

