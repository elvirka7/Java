package day39_Recap.statesTask;

public class Texas extends States{
    public Texas( String politicalParty, String governor, String senator, int population, double stateTaxRate) {
        super("Texas", "TX", politicalParty, governor, senator, population, stateTaxRate);
    }

    @Override
    public void isKnownFor() {
        System.out.println(getName()+" is the second largest state");
    }
}
