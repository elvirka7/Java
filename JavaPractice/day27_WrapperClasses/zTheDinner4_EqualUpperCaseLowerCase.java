package day27_WrapperClasses;

public class zTheDinner4_EqualUpperCaseLowerCase {

    public static void main(String[] args) {
        String str = "JAVA java";
        System.out.println(equalLowerUpper(str));
    }

    public static boolean equalLowerUpper(String str){
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))){
                countUpper++;
            }
            if (Character.isLowerCase(str.charAt(i))){
                countLower++;
            }
        }
        return countUpper==countLower;
    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */