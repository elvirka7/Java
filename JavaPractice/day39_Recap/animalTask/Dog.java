package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal{


    public Dog( String breed, String size, String color, char gender, int age, boolean isWild) {
        super("Dog", breed, size, color, gender, age, isWild);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+ " is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" "+getBreed()+" barks");
    }

}
