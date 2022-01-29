package day39_Recap.scrumTeamTask;

public class Employee extends Person {

    private int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<=0){
            System.err.println("Invalid id");
            System.exit(1);
        }
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid job title");
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Invalid salary entry");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+" "+getName() + "is working");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", id=" + id +
                ", jobTitle='" + jobTitle +
                ", salary=" + salary;
    }
}
