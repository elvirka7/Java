package practice_12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Aysegul","Timur","Oleksandr","Jilili"};

        String[] scrum2 = {"Ali","Olga"};

        String[] scrum3 = {"Sergei","Yuliya","Farangez"};

        String [][] scrumteams = {{"Aysegul","Timur","Oleksandr","Jilili"},{"Ali","Olga"},{"Sergei","Yuliya","Farangez"}};
                               //{scrum1,scrum2,scrum3}

        System.out.println(Arrays.deepToString(scrumteams));

        System.out.println("=======================");

        System.out.println(scrumteams[1][1]);

        System.out.println("=======================");

        for (String[] eachScrum : scrumteams){
            System.out.println(Arrays.toString(eachScrum));
        }

        System.out.println("==============================");

        for (String[] eachScrum : scrumteams){
            for (String eachName : eachScrum){
                System.out.print(eachName+" ");
            }

        }

    }
}
