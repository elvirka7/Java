package day34_GarbageCollection_AccessModifiers.muhtar_tasks;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName, fieldOfStudy, programmingLanguage, secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName="Cydeo";
        fieldOfStudy ="SDET";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is "+schoolName);
    }

    public static void  printSecretCode(){
        System.out.println("Secret code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name+" is study in Cydeo "+ batchNumber);
    }

    public String toString() {
        return "CydeoStudent2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", School Name=" + schoolName +
                ", field of Study=" + fieldOfStudy +
                ", programming language=" + programmingLanguage +
                ", secret code =" + secretCode +
                '}';
    }
}
/*
    2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */