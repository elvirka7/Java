package day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin( String breed, String size, String color, char gender, int age, boolean isWild) {
        super("Dolphin", breed, size, color, gender, age, isWild);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+ " is eating fish");
    }

    @Override
    public void pet() {
        System.out.println(getName()+" is not a pet");
    }

    public void swim(){
        System.out.println(getName()+" swims");
    }

}
