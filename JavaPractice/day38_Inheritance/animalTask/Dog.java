package day38_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, int age, String size, String color) {
        super(name, breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats dog food");
    }

}
