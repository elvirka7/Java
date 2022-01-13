package day22_MultiDimensionalArray;

public class ZLunch3_PrintEachArr8D {
    public static void main(String[] args) {

        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };

        for (int[][][][][][][] ints : arr8D) {
            for (int[][][][][][] anInt : ints) {
                for (int[][][][][] ints1 : anInt) {
                    for (int[][][][] ints2 : ints1) {
                        for (int[][][] ints3 : ints2) {
                            for (int[][] ints4 : ints3) {
                                for (int[] ints5 : ints4) {
                                    for (int i : ints5) {
                                        System.out.print(i+" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
