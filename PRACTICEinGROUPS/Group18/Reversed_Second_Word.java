package Group18;

public class Reversed_Second_Word {
    public static void main(String[] args) {

        String word = "Today is a java day";
        String result = "";

        String temp = word.substring(word.indexOf(" ") + 1);
        temp = temp.substring(0, temp.indexOf(" "));

        for (int i = temp.length() - 1; i >= 0; i--) {
            result += temp.charAt(i);
        }

        word = word.replace(temp, result);
        System.out.println(word);
    }
}
