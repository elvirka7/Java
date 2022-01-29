package day39_Recap.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguge;

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String programmingLanguge, int batchNumber, int groupNumber, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguge(programmingLanguge);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number entry");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("Invalid group number entry");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguge() {
        return programmingLanguge;
    }

    public void setProgrammingLanguge(String programmingLanguge) {
        if(programmingLanguge.isEmpty() || programmingLanguge.isBlank() || programmingLanguge == null){
            System.err.println("Invalid programming language entry");
            System.exit(1);
        }
        this.programmingLanguge = programmingLanguge;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats "+programmingLanguge + " tasks for lunch");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " drinks "+programmingLanguge + " tasks for dinner");
    }

    @Override
    public void sleep() {
        System.out.println("Because "+getName()+"is always eating and drinking "+programmingLanguge + ", "+getName()+" does not have time to sleep");
    }

    @Override
    public String toString() {
        return super.toString() +
        ", batchNumber="+ batchNumber +
        ", groupNumber="+groupNumber+
        ", programmingLanguge="+programmingLanguge;
    }
}
