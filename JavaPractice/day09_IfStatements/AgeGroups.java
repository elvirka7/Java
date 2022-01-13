package day09_IfStatements;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String agegroup="";

       if(age>0){

        if(age <=2){
            agegroup= "Infant";
        } else if(age <= 5){
            agegroup = "Toddler";
        } else if(age <=9){
            agegroup = "Kid";
        } else if(age<=12){
            agegroup = "Pre-Teen";
        } else if(age<=17){
            agegroup = "Teenager";
        } else if(age<=20){
            agegroup = "Young Adult";
        } else if(age<=39){
            agegroup = "Adult";
        } else if(age<=49){
            agegroup = "Young Middle-Aged Adult";
        } else if(age<=54){
            agegroup = "Middle-Aged Adult";
        } else if(age<=64){
            agegroup = "Very Young Senior Citizen";
        } else if(age<=74){
            agegroup = "Young Senior Citizen";
        } else if(age<=84){
            agegroup = "Senior Citizen";
        } else {
            agegroup = "Old Senior Citizen";
        }

       } else {
           agegroup = "Age can be only more than 0";
       }

        System.out.println(agegroup);

       sc.close();
    }
}
/*
 Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
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
 */