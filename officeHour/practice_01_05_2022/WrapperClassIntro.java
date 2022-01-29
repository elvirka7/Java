package practice_01_05_2022;

public class WrapperClassIntro {

    public String str="anything";


    public static void main(String args[]) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: Converting primitives into objects
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        //Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + shortobj);
        System.out.println("Integer object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

        //Unboxing: Converting Objects to Primitives
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue);


        //  parseInt(),parseDouble() etc vs valueOf()
        String str=new String();

        //Integer num=new Integer(300);
        Integer num3 = Integer.valueOf(300);   // return Object
        int num2 = Integer.parseInt("123");  // return primitives
        System.out.println("num2 : "+num2);
        System.out.println("num3 : " + num3);

        // - WrapperClassMethods
        System.out.println("=================");
        System.out.println(Integer.max(5, 4));
        System.out.println("Integer.min(5,4) = " + Integer.min(5, 4));
        System.out.println("Integer.sum(5,4) = " + Integer.sum(5, 4));

        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.compare(5,4) = " + Integer.compare(5, 4));
        System.out.println("Integer.compare(5,5) = " + Integer.compare(5, 5));
        System.out.println("Integer.compare(4,5) = " + Integer.compare(4, 5));

        System.out.println("Character.isDigit('4') = " + Character.isDigit('4'));
        System.out.println("Character.isAlphabetic('0') = " + Character.isAlphabetic('0'));
        System.out.println("Character.isLetter('r') = " + Character.isLetter('r'));
    }
    }
