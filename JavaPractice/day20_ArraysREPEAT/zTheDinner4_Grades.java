package day20_ArraysREPEAT;

public class zTheDinner4_Grades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

 grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'A';

        for (int i = 0; i < names.length; i++) {

            if(scores[i]>0 && scores[i]<=100){
            grades[i] = (scores[i]>=90)? 'A':(scores[i]>=80)? 'B' :(scores[i]>=70)? 'C' :(scores[i]>=60)? 'D' : 'F'; }
            String report = names[i]+"'s score is "+scores[i]+", and grade is "+grades[i];
            System.out.println(report);
        }
    }
}
/*
given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */