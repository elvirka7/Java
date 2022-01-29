package Day2_12_11_2021;

public class StringWithoutXFirstAndLast {
    /**
     * 3.
     * Given a string, if the first or last chars are 'x',
     * print the string without those 'x' chars,
     * and otherwise print the string unchanged.
     * (do with for loop)
     * <p>
     * <p>
     * input :"xHix" → Hi
     * input :"xHi" → Hi
     * input :"Hxix" → Hxi
     */

    public static void main(String[] args) {
        String word="xHellox";
        String temp="";
                        //0123
              // input:  "xHix" → Hi
        if (word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x'){
            /*
            for (int i = 1; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }

             */
            temp=word.substring(1,word.length()-1);
        }else if (word.charAt(0)=='x'){
            //012
            //   input :"xHi" → Hi
            for (int i = 1; i <word.length() ; i++) {
                temp+=word.charAt(i);
            }
        }
                    //0123
        //   input :"Hxix" → Hxi
        else if (word.charAt(word.length()-1)=='x'){
                          //2   //3
            for (int i = 0; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }
        }

        System.out.println("temp = " + temp);
    }
}
