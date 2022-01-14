package day38_Inheritance.employeeTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, int salary) {
        super(name, age, gender, id, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is teaching students");
    }
}
