package practice_01_05_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        /*
         * ArrayList is a resizable-array implementation of the List interface.
         *
         * The dif between Array and Arraylist Arrays have fixed length, ArrayList does
         * not have fixed size Arrays accept primitive types and object, ArrayList
         * stores only objects. A print statement we can print the ArrayList without
         * using to string or loop.

         * list.add()
         * list.get()
         * list.set()
         * list.indexOf()
         * list.lastIndexOf()
         * list.size()
         * list.contains()
         * list.remove()
         * Bulk Operations: Perform an operation on an entire Collection.
         * removeAll()
         * retainAll()
         * removeIf()
         * clear()
         * isEmpty()
         * Collections.sort(list)
         * Collections.frequency(list, object)
         */

        ArrayList<String> cities=new ArrayList<>();

        // add(Object):  adds the elements to the indexes of the arraylist
        // Autoboxing because ArrayList stores only objects

        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        System.out.println(cities);


        // add(index, Object): adds the element to the given index (index must be exist)
        cities.add(0,"Vienna");
        System.out.println(cities);

        // get(index): returns the element at given index
        // unboxing because get method returns an Integer object
        System.out.println("cities.get(0) = " + cities.get(0));

        // set(index, Object): replaces the old element at given index with new element
        System.out.println("cities.set(0,\"Miami\") = " + cities.set(0, "Miami"));
        System.out.println("cities.get(0) = " + cities.get(0));

        // indexOf(Object): returns the first matching object' index number
        System.out.println("cities.indexOf(\"Miami\") = " + cities.indexOf("Miami"));

        // size(): returns the total number of elements
        System.out.println("cities.size() = " + cities.size());

        // contains(): returns a boolean
        System.out.println(cities.contains("Denver"));

        // remove(index): removes the object at the given index
        System.out.println("cities.remove(0) = " + cities.remove(0));
        System.out.println("cities = " + cities);

        // remove(object): removes the first matching object
        System.out.println("cities.remove(\"London\") = " + cities.remove("London"));
        System.out.println("cities = " + cities);


        //  Bulk Op.

        // removeAll() : to remove multiple elements
        cities.removeAll(Arrays.asList("Paris","Istanbul"));
        System.out.println("cities = " + cities);


        // retainAll() : to retain multiple elements
        cities.add("Paris");
        cities.add("Istanbul");
        System.out.println(cities);
        cities.retainAll(Arrays.asList("Paris","Istanbul"));
        System.out.println("cities = " + cities);



        // removeIf()  : removes element according to condition
        cities.removeIf(each->each.length()>6);
        System.out.println("cities = " + cities);

        // clear(): removes all the objects from the List
        cities.clear();


        // isEmpty(): returns true if the list contains no element
        //1
        System.out.println(cities.isEmpty()?"list is empty":cities);
        //2
        System.out.println(cities.size()==0?"list is empty":cities);

    }
}
