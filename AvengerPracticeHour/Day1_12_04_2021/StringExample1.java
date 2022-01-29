package Day1_12_04_2021;

public class StringExample1 {
    /**
     * 1.Given a string, print the string made of its first two chars,
     * so the String "Hello" yields “HE".
     */



    public static void main(String[] args) {
      /* String str="Hello";
        str=  str.toUpperCase();
        String s = "" + str.charAt(0) + str.charAt(1);
        System.out.println("s = " + s);

       */

        String str="Hello";
        str=  str.toUpperCase();
        System.out.println("str = " + str.substring(0, 2));


    }
}
