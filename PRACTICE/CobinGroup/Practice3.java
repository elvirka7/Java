package CobinGroup;

public class Practice3 {
    public static void main(String[] args) {

        System.out.println(sortaSum(3,4));
        System.out.println(sortaSum(9,4));
        System.out.println(sortaSum(10,11));
    }

    public static int sortaSum(int a, int b){
        int sum = a+b;
        int result = (sum>=10 && sum<=19)? 20: sum;
        return result;
    }
}
