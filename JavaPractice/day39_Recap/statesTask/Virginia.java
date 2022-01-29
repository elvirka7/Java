package day39_Recap.statesTask;

public class Virginia extends States{

    public Virginia( String politicalParty, String governor, String senator, int population, double stateTaxRate) {
        super("Virginia", "VA", politicalParty, governor, senator, population, stateTaxRate);
    }

    @Override
    public void isKnownFor() {
        System.out.println(getName()+" is the birthplace of a nation");
    }
}
