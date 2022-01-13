package day35_Encapsulation.dinner_tasks.scrumTask;

public class Tester {

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.err.println("Invalid employee ID");
            return;
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary amount can't be negative");
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


}


/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fields

	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */