package day39_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion( String breed, String size, String color, char gender, int age) {
        super("Lion", breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }

    public void king(){
        System.out.println(getName()+" is the king of all animals");
    }

}
