package Day_06_01_22_2022;

public class Question3 {
    int count;

    public void m() {
        count++;
    }

    public void m(int n) {
        count *= n;
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.m(5); //count=0*5; -> count =0
        obj.m();     // count=count+1; -> count=1
        obj.count += 10; // count=1+10 -> count=11
        obj.m(2);  //count=11*2 -> count=22
        System.out.print(obj.count);


    }

}
