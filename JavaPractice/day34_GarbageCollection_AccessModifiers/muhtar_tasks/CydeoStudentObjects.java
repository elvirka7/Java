package day34_GarbageCollection_AccessModifiers.muhtar_tasks;

public class CydeoStudentObjects {
    public static void main(String[] args) {

        CydeoStudent student = new CydeoStudent("Ahmet", 'M', 27, 25, 18);

        System.out.println(student);

        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();

    }
}
