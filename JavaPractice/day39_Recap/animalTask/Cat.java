package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal {

    public Cat(String breed, String size, String color, char gender, int age, boolean isWild) {
        super("Cat", breed, size, color, gender, age, isWild);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating cat food");
    }

    public void scratch() {
        System.out.println(getName() + " " + getBreed() + " likes to scratch");
    }

    public void meow(){
        System.out.println(getName()+" "+getName()+" likes to meow");
    }

}
