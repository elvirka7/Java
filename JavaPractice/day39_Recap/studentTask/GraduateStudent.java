package day39_Recap.studentTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName() + " is a graduate level student at "+getSchoolName());
    }

    public void graduateLevel(){
        System.out.println("Gradute level students study for 1 or 2 years");
    }

}
