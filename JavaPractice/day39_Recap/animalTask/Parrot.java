package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot( String breed, String size, String color, char gender, int age, boolean isWild) {
        super("Parrot", breed, size, color, gender, age, isWild);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+ " is eating parrot food");
    }

    public void fly(){
        System.out.println(getName()+" likes to fly");
    }

    public void sing(){
        System.out.println(getName()+" can sing");
    }

}
