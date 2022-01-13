package day20_ArraysREPEAT;

public class zTheDinner_CommonElements {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        String common = "";

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array1.length; j++) {
                if(array1[i] == array2[j]) {
                    common+=array1[i]+" ";
                }



            }
        }
        System.out.println(common);


        }
    }

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */