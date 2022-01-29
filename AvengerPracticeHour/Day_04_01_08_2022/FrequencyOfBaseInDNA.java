package Day_04_01_08_2022;

public class FrequencyOfBaseInDNA {
    /**
     *  Q4:
     *        -An example of a length 21 DNA string(whose alphabet contains the symbols 'A','C','G','T')
     *        is "ATGCTTCAGAAAGGTCTTACG"
     *        Expected output:
     *        A:6 C:4 G:5 T:6
     */

    public static void main(String[] args) {
        String dna="ATGCTTCAGAAAGGTCTTACG";
    String result=   findFrequencyOfBaseInDNA(dna);
        System.out.println("result = " + result);
    }

    private static String findFrequencyOfBaseInDNA(String dna) {
        int a=findFrequencyOfLetter(dna,'A');
        int c=findFrequencyOfLetter(dna,'C');
        int g=findFrequencyOfLetter(dna,'G');
        int t=findFrequencyOfLetter(dna,'T');

        return  "A: "+ a+ " C: "+ c+ " G: "+g+ " T: "+t;
            }

    private static int findFrequencyOfLetter(String dna, char ch) {
        int counter=0;
   char[] chars=dna.toCharArray();
   for (char each:chars){
       if (each==ch){
           counter++;
       }
   }
   return counter;
    }
}
