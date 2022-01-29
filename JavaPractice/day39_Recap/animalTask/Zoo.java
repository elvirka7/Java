package day39_Recap.animalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static <Arraylist> void main(String[] args) {

        Bear bear = new Bear("polar", "large", "white", 'F', 27);
        Crocodile crocodile = new Crocodile("Australian", "large", "gray", 'F', 25);
        Dolphin dolphin = new Dolphin("delphinus", "medium", "light blueish gray", 'F', 5, true);
        Eagle eagle = new Eagle("Black and chestnut", "large", "black", 'F', 20);
        Lion lion = new Lion("South African", "large", "orange", 'M', 20);
        Python python = new Python("Angolan", "large", "brown", 'F', 4);
        Tiger tiger = new Tiger("Bengal", "large", "orange", 'M', 27);
        Cat cat = new Cat("Persian", "medium", "white", 'F', 6, false);
        Dog dog = new Dog("german shepherd", "large", "black", 'F', 7, false);
        Parrot parrot = new Parrot("blue crowned parakeet", "small", "blue", 'F', 5, false);

        ArrayList<Animal> zooList = new ArrayList<>();
        zooList.addAll(Arrays.asList(bear, crocodile, dolphin, eagle, lion, python, tiger, dog, dolphin, cat, parrot));

        System.out.println("\nCOMMON METHODS THAT ALL ANIMALS SHARE");
        for (Animal animal : zooList) {
            animal.eat();
            animal.drink();
            animal.sleep();
        }

        System.out.println("\n\nWILD ANIMALS METHODS ");
        ArrayList<WildAnimal> wildAnimalList = new ArrayList<>(Arrays.asList(lion,tiger,eagle,bear,python,crocodile));
        for (WildAnimal wildAnimal : wildAnimalList) {
            wildAnimal.hunt();
        }

        System.out.println("\n\nFRIENDLY ANIMALS METHODS");
        ArrayList<FriendlyAnimal> friendlyAnimalList = new ArrayList<>(Arrays.asList(dog,dolphin,cat,parrot));
        for (FriendlyAnimal friendlyAnimal : friendlyAnimalList) {
            friendlyAnimal.play();
            friendlyAnimal.pet();
        }

        System.out.println("\n\nINDIVIDUAL METHODS OF EACH ANIMAL");
        bear.hibernate();
        bear.honey();
        crocodile.climb();
        eagle.fly();
        lion.king();
        tiger.run();
        dolphin.swim();

        System.out.println("\n\nINDIVIDUAL METHODS OF EACH DOMESTIC ANIMAL");
        dog.bark();
        cat.scratch();
        cat.meow();
        parrot.fly();
        parrot.sing();

        System.out.println("\n\nFULL DETAILS OF ALL ZOO ANIMALS");
        System.out.println(zooList);

    }
}
