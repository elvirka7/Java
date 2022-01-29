package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{

    public Crocodile( String breed, String size, String color, char gender, int age) {
        super("Crocodile", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts for small mammals");
    }

    public void climb(){
        System.out.println(getName()+" can climb trees");
    }

}
