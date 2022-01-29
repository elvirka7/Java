package Group18;

public class Reverse_Second_Word_With_Array {

    public static void main(String[] args) {


        String word = "Today is a java day";

        String[] sentence = word.split(" ");
        String second = sentence[3];
        String result = "";

        for (int i = second.length() - 1; i >= 0; i--) {
            result += second.charAt(i);
        }
        sentence[3] = result;
        String result2 = "";

        for (int i = 0; i < sentence.length; i++) {
            result2 += sentence[i] + " ";
        }
        System.out.println(result2.trim());

    }
}