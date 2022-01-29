package Unique;

public class FindUniqe_Frequency {
    public static void main(String[] args) {


        String str = "AAAAizada";

        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            int count = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result += letters[i];
            }
        }
        System.out.println(result);
    }
}
