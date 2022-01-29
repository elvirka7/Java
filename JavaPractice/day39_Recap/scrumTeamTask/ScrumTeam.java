package day39_Recap.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;

    private ArrayList<Tester> testers =  new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
 setPO(PO);
        setBA(BA);
        setSM(SM);
        setTesters(testers);
        setDevelopers(developers);
    }


    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public void addTester(Tester tester){
        getTesters().add(tester);
    }

    public void addTesters(Tester [] testers){
        getTesters().addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        getTesters().removeIf(p->p.getId()==id);
    }

    public void addDeveloper(Developer developer){
        getDevelopers().add(developer);
    }

    public void addDevelopers(Developer [] developers){
        getDevelopers().addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int id){
        getDevelopers().removeIf(p->p.getId()==id);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers;
    }
}
