package day38_Inheritance.employeeTask;

import jdk.swing.interop.SwingInterOpUtils;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int id;
    public String jobTitle;
    public int salary;
    public String  companyName;


    public Employee(String name, int age, char gender, int id, String jobTitle, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = "Apple Inc";
    }

    public void work(){
        System.out.println(name+" works as a "+jobTitle);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary='" + salary + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
