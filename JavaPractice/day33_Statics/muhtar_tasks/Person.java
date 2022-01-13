package day33_Statics.muhtar_tasks;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman, hasNose, hasWings;
    public static int numberOfEyes, numberOfHead;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    static{
        isHuman = true;
        hasNose = true;
        hasWings = false;
        numberOfHead = 1;
        numberOfEyes = 2;
  ;
    }

    public Person() {

    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String sleep() {
        return name+" is sleeping";
    }

    public String toString() {
        return "Person{" +
                "name=" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", is human='" + isHuman + '\'' +
                ", has nose='" + hasNose + '\'' +
                ", has wings='" + hasWings + '\'' +
                ", number of head='" + numberOfHead + '\'' +
                ", number of eyes='" + numberOfEyes + '\'' +
                ", "+ sleep() +
                '}';
    }


}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()


 */