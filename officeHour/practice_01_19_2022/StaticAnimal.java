package practice_01_19_2022;

public class StaticAnimal {

   static String animal = "Dog";

    static {
        animal = "cat";
    }

    public static void main(String[] args) {
         StaticAnimal st1 = new StaticAnimal();
         st1.animal = "rabbit";
         StaticAnimal st2 = new StaticAnimal();
        System.out.println(st1.animal.equals(st2.animal));

    }
}
