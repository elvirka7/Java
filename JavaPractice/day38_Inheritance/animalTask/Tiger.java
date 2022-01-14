package day38_Inheritance.animalTask;

public class Tiger extends Animal{

    public Tiger( String breed, int age, String size, String color) {
        super("Tiger", breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats deer");
    }
}
