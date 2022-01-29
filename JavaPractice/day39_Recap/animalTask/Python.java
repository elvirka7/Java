package day39_Recap.animalTask;

public class Python extends WildAnimal{

    public Python( String breed, String size, String color, char gender, int age) {
        super("Python", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts for mice");
    }

    @Override
    public void eat(){
        System.out.println(getName()+" eats antilopes");
    }


}
