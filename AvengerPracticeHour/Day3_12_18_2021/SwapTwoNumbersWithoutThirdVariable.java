package Day3_12_18_2021;

public class SwapTwoNumbersWithoutThirdVariable {
/*
int a =10;
int b=15;


int a=15;
int b=10;

int temp=a;
int a=b;
int b=temp;

 */

    public static void main(String[] args) {
        int a=15;
        int b=10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b;//25
        b=a-b;//25-10=15
        a=a-b;//25-15=10

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
