package day33_Statics.muhtar_tasks;

public class CydeoStudentOjbects {
        public static void main(String[] args) {

            CydeoStudent student = new CydeoStudent("Ahmet", 27, 007, 25, 18, 'M', 'A');

            System.out.println(student);
            student.attendClass();
            student.study();
        }
    }