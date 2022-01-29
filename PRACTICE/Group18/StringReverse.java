package Group18;

public class StringReverse {

    public static void main(String[] args) {

        String word = "Today is a java day";

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);

    }
}
