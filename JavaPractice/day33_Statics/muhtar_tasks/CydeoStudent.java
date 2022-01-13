package day33_Statics.muhtar_tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class CydeoStudent {
    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;
    public static String schoolName, programmingLanguage;


    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
    }


    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static String printSchoolName(){
        return schoolName;
    }

    public static String printProgLanguage(){
        return programmingLanguage;
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school=" + printSchoolName() +
                ", school=" + printSchoolName() +
                ", programming language=" + printProgLanguage() +
                '}';
    }
}

/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */