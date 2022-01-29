package _8_OOP._1PersonI;

import java.util.Scanner;

class PersonI {

    private String firstName;
    private String lastName;
    private int age;

    public PersonI(){
        setFirstName("undefined");
        setLastName("undefined");
        setAge(-1);

    }

    public PersonI(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        this.age = age;
    }


    public String toString(){
        return firstName+" | "+ lastName+" | " + age;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PersonI person = new PersonI();


        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        PersonI person2 = new PersonI(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());


    }
}
