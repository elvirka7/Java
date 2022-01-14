package day38_Inheritance.animalTask;

import java.util.Arrays;

public class AnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Musya", "zhapaiy", 7, "large", "white");
        Dog dog = new Dog("Rex", "ovcharka", 7, "medium", "black");
        Tiger tiger = new Tiger("madagaskar", 5, "XXL", "orange");
        Eagle eagle = new Eagle("gornyi", 3, "petite", "brown");

        Animal[] zoo = {cat, dog, tiger, eagle};
        for (Animal animal : zoo) {
            animal.eat();
        }

        System.out.println(Arrays.toString(zoo));
    }
}
