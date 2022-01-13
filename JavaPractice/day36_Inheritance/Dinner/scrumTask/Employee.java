package day36_Inheritance.Dinner.scrumTask;

public class Employee extends Person{

    public int id;
    public double salary;
    public String jobTitle;
    public String companyName;

    public Employee(String name, int age, char gender, int id, double salary, String jobTitle, String companyName){
        super(name, age, gender);
        this.companyName = companyName;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    public void work(){
        System.out.println(name + " works");
    }


    public String toString() {
        return "Employee details: " +
                "company name=" + companyName +
                "id=" + id +
                ", salary=$" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender;
    }
}
