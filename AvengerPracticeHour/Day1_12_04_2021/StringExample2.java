package Day1_12_04_2021;

public class StringExample2 {

    /**
     * 2. Create a method print a new string made of
     * 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     *
     */
    public static void main(String[] args) {
/*
                  //01234
        String str="CYDEO";      //5       - 1 =4
        int lastIndexOfChar = str.length() - 1;
                                  //5       - 2 =3
        int lastsecondOfChar = str.length() - 2;
       String result=""+ str.charAt(lastsecondOfChar)+str.charAt(lastIndexOfChar);
      //  System.out.println(result+result+result);
        System.out.println("result = " + result.repeat(3));
        
 */
        String str="CYDEO";
        int lastsecondOfChar = str.length() -2;
        String chars = str.substring(lastsecondOfChar);
        System.out.println(chars.repeat(3));



    }
}
