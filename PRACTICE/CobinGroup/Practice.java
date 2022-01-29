package CobinGroup;

public class Practice {

public static boolean cigarParty(int cigars, boolean weekend){
    boolean result = (cigars>=40 && cigars<=60)? true :(cigars>=40 && weekend==true)? true: false;
        return result;
}

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));  //returns false
        System.out.println(cigarParty(50, false));  //returns true
        System.out.println(cigarParty(70, true));   //returns true
    }
}
