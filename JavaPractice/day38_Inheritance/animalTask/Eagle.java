package day38_Inheritance.animalTask;

public class Eagle extends Animal{
    public Eagle( String breed, int age, String size, String color) {
        super("Eagle", breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats snake");
    }
}
