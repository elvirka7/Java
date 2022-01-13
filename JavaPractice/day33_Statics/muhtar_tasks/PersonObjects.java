package day33_Statics.muhtar_tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class PersonObjects {
    public static void main(String[] args) {

        Person person = new Person("Ahmet", 27, 'M');
        System.out.println(person);

        person.drink("kymyz");
        person.eat("beshbarmak");

    }
}
