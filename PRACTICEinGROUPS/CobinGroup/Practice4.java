package CobinGroup;

public class Practice4 {

    public static boolean hasBad(String str) {

        boolean result = (str.substring(0, 3).equalsIgnoreCase("bad") || str.substring(1, 4).equalsIgnoreCase("bad")) ? true : false;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }
}
