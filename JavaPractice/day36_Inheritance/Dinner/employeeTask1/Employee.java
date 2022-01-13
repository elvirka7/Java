package day36_Inheritance.Dinner.employeeTask1;

public class Employee {

    public String name, jobTitle;
    public static String companyName = "Wells Fargo";
    public int age, id, salary;


    public Employee( String  name, String jobTitle, int age, int id, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working at "+companyName);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
