package _4_LoopsREPEAT;

import java.util.Scanner;

public class _12_EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;


        for (int i = 0, j = 0; i < sentence.length() - 3 && j < sentence.length() - 5; i++, j++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                countJava++;
            }
            if (sentence.substring(j, j + 6).equals("python")) {
                countPython++;
            }
        }
        System.out.println(countJava == countPython);
        scan.close();

    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?

output: false
 */