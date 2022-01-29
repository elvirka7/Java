package day39_Recap.studentTask;

public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age,gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isBlank() || fieldOfStudy.isEmpty()||fieldOfStudy==null){
            System.err.println("Invalid field of study entry");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade!='A' && grade!='B' && grade!='C' && grade!='D' && grade!='F'){
            System.err.println("Invalid grade entry");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName.isBlank() || schoolName.isEmpty()||schoolName==null){
            System.err.println("Invalid school name entry");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " studies at "+schoolName);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy+
                ", grade=" + grade +
                ", schoolName='" + schoolName+
                "\n\n";
    }
}
