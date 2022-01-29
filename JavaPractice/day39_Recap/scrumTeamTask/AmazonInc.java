package day39_Recap.scrumTeamTask;


import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

    ProductOwner po = new ProductOwner("Alla", 29, 'F',112,160000);
    ScrumMaster sm = new ScrumMaster("Malla", 26, 'F', 334, 145000);
    BusinessAnalyst ba = new BusinessAnalyst("Valla", 30, 'F', 223, 150000);

    Tester tester1 = new Tester("Tom", 34, 'M', 345, 213345, "Automation");
    Tester tester2 = new Tester("Gom", 35, 'F', 346, 113345, "Manual");
    Tester tester3 = new Tester("Rom", 36, 'M', 347, 123345, "Manual");
    Tester tester4 = new Tester("Hom", 37, 'F', 348, 113345, "Manual");



    Developer developer1 = new Developer("Manan", 24, 'M', 444, 230000);
    Developer developer2 = new Developer("Hanan", 26, 'F', 347, 230000);
    Developer developer3 = new Developer("Kanan", 25, 'F', 349, 230000);
    Developer developer4 = new Developer("Lanan", 28, 'F', 360, 230000);
    Developer developer5 = new Developer("Sanan", 29, 'M', 361, 230000);


    ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4));
    ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

    ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm, testers, developers);

        System.out.println(scrumTeam);
    }
}
