package day11_Switch_Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 100;
        String result = "";
        int ageGroup = (age ==1 || age ==2)? 1 :(age >=3 && age <=5)? 2 :(age >=6 && age <=9)? 3 : (age >=10 && age <= 12)? 4
                :(age >=13 && age <= 17)? 5 :(age >=18 && age<= 20)? 6 :(age >=21 && age <=39)? 7
                :(age >=40 && age <=49)? 8 :(age >= 50 && age <= 54)? 9 :(age >=55 && age <= 64)? 10
                :(age >=65 && age <= 74)? 11 :(age>= 75 && age <= 84)? 12 :(age >85)? 13: 14;


        switch (ageGroup) {
            case 1:
                result="Infant";
                break;
            case 2:
                result="Toddler";
                break;
            case 3:
                result="Kid";
                break;
            case 4:
                result="Pre-Teen";
                break;
            case 5:
                result="Teenager";
                break;
            case 6:
                result="Young Adult";
                break;
            case 7:
                result="Adult";
                break;
            case 8:
                result="Young Middle-Aged Adult";
                break;
            case 9:
                result="Middle-Aged Adult";
                break;
            case 10:
                result="Very Young Senior Citizen";
                break;
            case 11:
                result="Young Senior Citizen";
                break;
            case 12:
                result="Senior Citizen";
                break;
            case 13:
                result="Old Senior Citizen";
                break;
            default: result = "Invalid age";
        }
        System.out.println(result);


    }
}
/*
write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement

 */