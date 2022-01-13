package practice_12_29_2021;

import java.util.Arrays;

public class BooleanArray {

    public static void main(String[] args) {

        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr = new boolean[arr.length];

        for (int i = arr.length-1; i >-1 ; i--) {
             if(arr[i]%2 == 0){
                 bArr[arr.length-1-i]=true;
                 // bArr[0]=true
             }
        }

        System.out.println(Arrays.toString(bArr));
    }
}
