package day17_While_DoWhileCHECK;

public class SkipEven {
    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {
            if(!(i%2==0)){
                continue;
            }
            System.out.print(i);


        }
    }
}
