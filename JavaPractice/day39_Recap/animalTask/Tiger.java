package day39_Recap.animalTask;

public class Tiger extends WildAnimal{

    public Tiger( String breed, String size, String color, char gender, int age) {
        super("Tiger", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts rabbits");
    }

    public void run(){
        System.out.println(getName()+" run very fast");
    }
}
