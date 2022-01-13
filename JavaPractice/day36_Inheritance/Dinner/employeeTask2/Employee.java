package day36_Inheritance.Dinner.employeeTask2;

public class Employee {

    public String name;
    public char gender;
    public int age, id;
    public String jobTitle;
    public int salary;


    public void setInfo(String name, char gender, int age, int id, String jobTitle, int salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
