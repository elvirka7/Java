package day39_Recap.animalTask;

public class Eagle extends WildAnimal{

    public Eagle( String breed, String size, String color, char gender, int age) {
        super("Eagle", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts rabbits and other birds");
    }

    public void fly(){
        System.out.println(getName()+" flies very high");
    }
}
