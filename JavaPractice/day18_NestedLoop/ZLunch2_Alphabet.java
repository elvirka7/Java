package day18_NestedLoop;

public class ZLunch2_Alphabet {
    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println();
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print(" "+i + j);
            }
        }


    }
}

