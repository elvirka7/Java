package day39_Recap.statesTask;

public class Florida extends States{
    public Florida( String politicalParty, String governor, String senator, int population, double stateTaxRate) {
        super("Florida", "FL", politicalParty, governor, senator, population, stateTaxRate);
    }

    @Override
    public void isKnownFor() {
        System.out.println(getName()+" is known for its beaches");
    }
}
