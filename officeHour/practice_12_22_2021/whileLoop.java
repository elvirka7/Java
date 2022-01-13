package practice_12_22_2021;

public class whileLoop {

    public static void main(String[] args) {
//        int number=5;
//
//        while(number<100){
//
//            number +=number; // number= number+number; //number= 80+80=160
//        }
//
//        System.out.println(number);

//        int a =0;
//
//        do {
//
//            a = a++ + --a - (a%3); //a= 3 + 3 - 0=6
//                             7%3==1 // remainder = leftover after division
   //                          7/3==2// answer of division
      //      a%2==0
//        } while(++a <4);
//
//        System.out.println(a);

//        String str ="The whole time it was raining.";
//
//        do{
//            System.out.println(str.charAt(0)); // "T o miw in"
//            str= str.substring(3); //str=" whole time it was raining."
//                                  // str="ole time it was raining."
//                                  // str=" time it was raining."
//                                  // str="me it was raining."
//                                  // str="it was raining."
//                                  // str="was raining."
//                                  // str=" raining."
//                                  //str= "ining."
//                                  // str="ng."
//                                  //str=
//        }while(!str.isEmpty());

//    String s = "I will find the lost book";
//    String word= "";

//    for(int index=s.length()-1;index<=1;index--){
//        word += s.charAt(index);
//    }
//        System.out.println(word);

//        String input = "today it will be 100 degrees !"; //length=30
//       // System.out.println(input.length());
//        int n=0;
//        System.out.println(n++);
//        System.out.println(n);
//        System.out.println(++n);
//        System.out.println(n);
//
//
//
//
//        while(n++ < input.length()){
//
//            if(n==8){
//                continue;
//            }else if(n==9){
//                break;
//            }
//
//            System.out.print(input.charAt(++n));//charAt(2)=d
//                                               // charAt(4)=y
//                                              //charAt(6)=i
//                                              //charAt(8)=''
//        }
//

        int count=0;

        for(int a=0; a<4;a++){
             if(a==3) continue;

             for(int b=a+1; b<5;b++){
                 count++;

                 if(b==3) break;
             }
        }

        System.out.println(count);


    }
}
