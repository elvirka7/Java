package day38_Inheritance.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, String size, String color) {
        super(name, breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats cat food");
    }

}
