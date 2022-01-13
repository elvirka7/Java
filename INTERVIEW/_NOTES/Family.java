package _NOTES;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Family {
    public String name;
    public int age;

    //setInfo method
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString for printing
    public String toString() {
        return "Our family {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //method
    public void happy(){
        System.out.println(name+" is happy");
    }
    public void kid(){
        System.out.println(name+" is still a child");
    }


    //MAIN METHOD
    public static void main(String[] args) {
        Family member1 = new Family();
        Family member2 = new Family();
        Family member3 = new Family();
        Family member4 = new Family();

        member1.setInfo("Grant", 38);
        member2.setInfo("Elvira", 37);
        member3.setInfo("Kai", 8);
        member4.setInfo("Alia", 2);

        //ARRAY OF FAMILY OBJECTS
       Family [] family = {member1,member2,member3,member4};
        for (Family each : family) {
            each.happy();
        }

        //ARRAYLIST OF FAMILY OBJECTS
        ArrayList<Family> familyList = new ArrayList<>((Arrays.asList(member1,member2,member3,member4)));
       //OR familyList.addAll(Arrays.asList(member1,member2,member3,member4));
        for (Family each : familyList) {
            if(each.age<21){
                each.kid();
            }
        }

        Collections.reverse(familyList);
        System.out.println(familyList);

        }
    }
