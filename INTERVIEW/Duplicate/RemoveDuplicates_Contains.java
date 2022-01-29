package Duplicate;

public class RemoveDuplicates_Contains {
    public static void main(String[] args) {

        String str = "aaaaaaaaizada";
        char[] letters = str.toCharArray();
        String result = "";
        for (char each : letters) {
            if(!(result.contains(""+each))) {
                result += each;
            } else {
                continue;
        }
        }
        System.out.println(result);
    }
}
