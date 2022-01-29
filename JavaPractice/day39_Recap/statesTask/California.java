package day39_Recap.statesTask;

public class California extends States{
    public California(String politicalParty, String governor, String senator, int population, double stateTaxRate) {
        super("California","CA", politicalParty, governor, senator, population, stateTaxRate);
    }

    @Override
    public void isKnownFor() {
        System.out.println(getName()+" is known for Hollywood");
    }
}
