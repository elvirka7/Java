package day27_WrapperClasses;

public class zTheDinner3_RetrieveMethodDOMYSELFAGAIN {

    public static void main(String[] args) {
        String str = "Wooden Spoon!";

        String []str1 = retrieve(str);
        System.out.println("Characters =  " + str1[2]);
        System.out.println("Letters  = "+ str1[0]);
        System.out.println("Digits =  " + str1[1]);
    }

    public static String[] retrieve(String str) {

        String letters = "";
        String digits = "";
        String characters = "";

        String[] arr = new String[3];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else {
                characters += str.charAt(i);
            }
        }
        arr[0] = letters;
        arr[1] = digits;
        arr[2] = characters;

        return arr;

    }
}
/*

3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */