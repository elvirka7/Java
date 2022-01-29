package day39_Recap.studentTask;

public class UndegraduateStudent extends Student{
    public UndegraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName() + " is an undergraduate level student at "+getSchoolName());
    }

    public void underGraduateLevel(){
        System.out.println("Undergraduate level students study for 4 years");
    }
}
