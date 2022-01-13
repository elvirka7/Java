package day07_Operators;

public class TempVariables {
    public static void main(String[] args) {

        int a = 10, b = 15;
        int temporaryVariable = a;  // temporaryVariable is now equal to 10;
        a = b;                      // a is now equal to 15;
        b = temporaryVariable;      // b is now equal to 10;

        System.out.println(a);
        System.out.println(b);

    }
}
/*
write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */