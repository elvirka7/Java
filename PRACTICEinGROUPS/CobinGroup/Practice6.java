package CobinGroup;

public class Practice6 {
    public static void main(String[] args) {

        String str = "anna";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        boolean isPlaindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPlaindrome);
    }
}
