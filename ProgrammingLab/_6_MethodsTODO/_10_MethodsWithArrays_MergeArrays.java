package _6_MethodsTODO;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MethodsWithArrays_MergeArrays {
    public static int[] mergR(int[] a,int[] b) {

        int length = a.length+b.length;
        int [] mergedArray = new int[length];

        int z = 0;
        for (int element : a) {
            mergedArray[z++] = element;
        }
        for (int each : b) {
            mergedArray[z++] = each;
        }
        return mergedArray;

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}
/*
mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])
​
returns [1,2,3,4,5,6]
mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]
mergR([1,2],[6,8])
​
returns [1,2,6,8]
mergR([1,2],[6,8])

returns [1,2,6,8]
hint:

create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
 */