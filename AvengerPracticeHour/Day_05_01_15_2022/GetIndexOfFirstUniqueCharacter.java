package Day_05_01_15_2022;

public class GetIndexOfFirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "dasasll";
        int position = getUniqueCharacter(s);
        System.out.println("position = " + position);
    }

    private static int getUniqueCharacter(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        for (i = 0; i < chars.length; i++) {
            int count = 0;
            char ch = chars[i];
            for (int i1 = 0; i1 < chars.length; i1++) {
                if (ch == chars[i1]) {
                    count++;
                }
            }
            if (count == 1) {
                break;
            }
        }

        if (i == chars.length) {
            return -1;
        } else {
            return i + 1;
        }


    }
}


