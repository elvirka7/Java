package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {

        String name = "Kai Foster";
        int birthDay = 22,
                birthYear = 2014;
        String birthMonth = "August";

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);

    }
}
/*
Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */