package practice_12_29_2021;

public class NumsArray {

    public static void main(String[] args) {

        int [] nums = {14,1,84,97,1243,46};
        int total = 0;

        for (int i = 0; i <nums.length ; i++) {
             if (nums[i] % 2 != 0){
                 total += 3;
             }else {
                 total += 10;
             }

             if(i % 3 == 0){  // it is not nums[i], it is just i
                 total -= 15;
             }
        }

        System.out.println(total);
    }
}
