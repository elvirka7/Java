package practice_01_26_2022.encaapsulation;

public class AddressObject {

    public static void main(String[] args) {

        Address home = new Address();
        home.setStreet("1234 Abcd rd. Suite 756");
        home.setCity("Chicago");
        home.setState("IL");
        home.setZipCode("57896");

        System.out.println("Home address: "+ home);

        home.setZipCode("578762");
        home.setStreet("");
        System.out.println(home.getStreet());
        home.setZipCode("67895");

        System.out.println("Home address: "+home);

        Address work = new Address("1234 Abcd rd. Suite 756","Chicago","IL","56784");
        System.out.println("Work Address: "+ work);
    }
}
