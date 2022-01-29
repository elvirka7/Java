package Day3_12_18_2021;

public class WritingTillWord {
/**
 * 1.
 *                                 Given a non-empty string like "Code" print a string like below output.
 *                                 (do with substring  first)
 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 *
 */

public static void main(String[] args) {
                         //0123
    String word="Code";
/*
    String c=word.substring(0,1);
    System.out.println("c = " + c);
    String co=word.substring(0,2);
    System.out.println("co = " + co);
    String cod= word.substring(0,3);
    System.out.println("cod = " + cod);
    String code= word.substring(0,4);
    System.out.println("code = " + code);


 */ //0123
    //Code
    //od

    String var=word.substring(0);
    String var2=word.substring(1,3);
    System.out.println("var2 = " + var2);
    System.out.println("var = " + var);
/*
    for (int i = 0; i <=word.length() ; i++) {
        String tem=word.substring(0,i);
        System.out.print( tem);
    }


 */

}
}
