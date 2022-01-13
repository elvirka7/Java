package day33_Statics.muhtar_tasks;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog = new Dog("german shepherd", "big", "female", "red", 7, true);

        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.play();


    }
}
