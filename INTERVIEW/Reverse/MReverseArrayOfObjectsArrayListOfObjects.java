package Reverse;

import _NOTES.Family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MReverseArrayOfObjectsArrayListOfObjects {
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
        Family [] family = { member1, member2, member3, member4};
        Family [] reversedFamily = new Family[family.length];
        int j = 0;
        for (int i = family.length - 1; i >= 0; i--) {
            reversedFamily[j++] = family[i];
        }
        System.out.println(Arrays.toString(reversedFamily));



        //ARRAYLIST OF FAMILY OBJECTS
        ArrayList<Family> familyList = new ArrayList<>((Arrays.asList(member1,member2,member3,member4))); //OR familyList.addAll(Arrays.asList(member1,member2,member3,member4));
        Collections.reverse(familyList);
        System.out.println(familyList);

    }
}
