package day39_Recap.scrumTeamTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()){
            System.out.println("Invalid entry for name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Invalid entry for age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender input");
            System.exit(1);
        }
        this.gender = gender;
    }


    public void eat(String food){
        System.out.println(name + " is eating "+food );
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }


    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender;
    }

}
