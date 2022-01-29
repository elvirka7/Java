package Day_04_01_08_2022;

public class EqualZerosAndOnes {
    /**
     *   Q3:
     *        - Given an array [1,1,1,0,1,0], after how many moves you need to make it equal the number of 0s and 1s
     *        - it should be given even length of Array
     *        Expected output:1
     */

    public static void main(String[] args) {
    int [] array={1,1,1,0,1,0}    ;
    int countZeros=0;
    int countOnes=0;
    int moves;
        for (int i : array) {
            if (i==1){
                countOnes++;
            }else {
                countZeros++;
            }
        }
        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeros = " + countZeros);

        if (countOnes<countZeros){
            moves=(countZeros-countOnes)/2;
        }else {
            moves=(countOnes-countZeros)/2;
        }
        System.out.println("moves = " + moves);


/*
      System.out.println("Math.abs(-2) = " + Math.abs(2));
       System.out.println("moves:"+Math.abs((countZeros - countOnes) / 2));


 */
    }

}
