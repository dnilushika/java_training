public class DataTypes {
    public static void main(String[] args) {
        byteExample();
        shortExample();
        intExample();
        longExample();
        floatExample();
        doubleExample();
        booleanExample();
        charExample();
    }

    public static void byteExample(){

        byte p = 127;
        byte q = 1;
        byte sumA = (byte) (p + q);
        System.out.println("Byte : "+sumA);
        // Output -128

        byte a = 2;
        byte b = 127;
        byte c = 127;
        byte sumB = (byte) (a + b + c);
        System.out.println("Byte : "+sumB);
        // Outout 0
    }

    public static void shortExample(){
        short s = 2000;
        short t = 3000;
        short sum = (short) (s + t);
        System.out.println("Short : "+sum);
    }

    public static void intExample() {
        int a = 10;
        int b = 12;
        int sum = a + b;
        System.out.println("Int : "+sum);
        
    }

    public static void longExample() {
        var a = 10L;
        long b = 12;
        long sum = a + b;
        System.out.println("Data Type : "+((Object)sum).getClass().getName());
        System.out.println("Long : "+ sum);
    }

    public static void floatExample() {
        var a = 10.457;
        float b = 12.6753f;
        float sum = (float)a + b;
        System.out.println("Data Type : "+((Object)sum).getClass().getName());
        System.out.println("Long : "+ sum);
    }

    public static void doubleExample() {
       // calculate area of a circle
       String pi = "3.142";
       double radius = 4.46;
       // calculate area
       double area = Double.parseDouble(pi)*Math.pow(radius, 2);
       System.out.println("Area of the circle : "+area);

      
       // Cacllate volume of a pyramid
       String l = "4.368";
       byte h = 12;
       float w = 4.67f;

        // v = (l*w*h)/3
        // Double.parseDouble

       double v = (Double.parseDouble(l)*h*w)/3;
       System.out.println("Volume of the pyramis : "+v);

    }

    public static void booleanExample(){

        boolean a = true;
        boolean b = false;

        if(a){
            System.out.println("a is true");
        }else{
            System.out.println("a is false");
        }

        if(b){
            System.out.println("b is true");
        }else{
            System.out.println("b is false");
        }

    }

    public static void charExample() {
        char myChar = 'B';
        System.out.println((int)myChar);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
    
}

/**
 * 

 There are two kinds of data types in Java
1. Premetive Type
2. Object Types (Reference Types)

Computer memory scales
8 bit = 1 bytes
1024 bytes = 1 mega byte
1024 mega byte = 1 giga byte
1024 giga byte = 1 tera byte
1024 tera byte = 1 peta byte

Primitive types

byte b = 127;                // Byte
short s = 12000              // Short
int myNum = 359099744;       // Integer (whole number)
long l = 123232132132431233  // Long integers
float myFloatNum = 5.99f;    // Floating point number
double d = 3.142365784936373 // Double
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean


 */
