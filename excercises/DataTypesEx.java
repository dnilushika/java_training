import java.text.DecimalFormat;

public class DataTypesEx {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
    }

    // 1. Write a Java program to print an int, a double and a char on screen.
    static void q1(){
        int x = 50;
        double y = 45.25;
        char z = 'z';

        System.out.println("Int : "+x+"\nDouble : "+y+ "\nChar : "+z);
        
    }

    // 2. Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
    static void q2(){
        int length = 2;
        int width = 3;
        int area = length * width;
        System.out.println("Area of Rectangle : "+area);
    };

    // 3. Write a program to print the product of the numbers 8.2 and 6.
    static void q3(){       
         double num1 = 8.2f;
         int num2 = 6;
         double product = num1*num2;
         DecimalFormat df = new DecimalFormat("0.00");
         System.out.println("product " + df.format(product));
    }

    
   //  4. Print the ASCII value of the character 'h'.
    static void q4(){
        System.out.println("ASCII value of h : "+(int)'h');
        System.out.println("Chae value of 104 : "+(char) 104);
    }

    
    // 5. Write a program to assign a value of 100.235 to a double variable and then convert it to int.
    static void q5(){
        double value = 100.235;
        int ivalue = (int) value;
        System.out.println(ivalue);

    }

    
    // 6. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
    static void q6(){
        int asciiValue = 'd';
        int newAscii = asciiValue +3;
        char newChar = (char) newAscii;
        System.out.println(newChar);

        System.out.println("New Char : "+ (char)('d'+3));
        
    }

    
    // 7. Write a program to add an integer variable having value 5 and a double variable having value 6.2.
    static void q7(){
        double x = 6.2;
        int  y = 5;
        System.out.println(x+y);
        
    }

    // 8. Write a program to find the square of the number 3.9.
    static void q8(){
        System.out.println(3.9*3.9);
        System.out.println(Math.pow(3.9, 2));
    }
}
