package day39_Recap.animalTask;

public class Bear extends WildAnimal{

    public Bear( String breed, String size, String color, char gender, int age) {
        super("Bear", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts for fish");
    }

    public void hibernate(){
        System.out.println(getName()+" hibernate");
    }

    public void honey(){
        System.out.println(getName()+" loves to eat honey");
    }

}
