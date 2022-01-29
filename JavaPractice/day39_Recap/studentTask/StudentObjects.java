package day39_Recap.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Aizada Coleman", 32, 'F', 123, "MBA", 'A', "American University - Central Asia");
        UndegraduateStudent undegraduateStudent = new UndegraduateStudent("Michelle Simon", 27, 'F', 234, "Antropology", 'B', "UNCC");
        CydeoStudent cydeoStudent = new CydeoStudent("Manas Kalenov", 19, 'M', 1008, "SDET", "Java", 25, 18, 'A');

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(graduateStudent, undegraduateStudent, cydeoStudent));
        for (Student student : studentList) {
            student.eat();
            student.drink();
            student.sleep();
            student.study();
        }

        graduateStudent.graduateLevel();
        undegraduateStudent.underGraduateLevel();


        System.out.println("\n\n"+studentList);
    }
}
