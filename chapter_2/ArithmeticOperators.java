public class ArithMeticOperators {
    public static void main(String[] args) {
        addition();
        substration();
        multiplication();
        division();
        modulas();
        increment();
        decrement();
    }

    static void addition(){
        int x = 10;
        int y = 15;
        int sum = x+y;
        System.out.println(sum);
    }

    static void substration(){
        int x = 10;
        int y = 15;
        int sub = x-y;
        System.out.println(sub);
    }

    static void multiplication(){
        int x = 10;
        int y = 15;
        int value = x*y;
        System.out.println(value);
    }

    static void division(){
        int x = 60;
        int y = 15;
        int value = x/y;
        System.out.println(value);
    }

    static void modulas(){
        int x = 65;
        int y = 15;
        int mod = x % y;
        System.out.println(mod);
    }

    static void increment(){
        int x = 10;
        int y = x++; // Assignment occures before incrementation
        System.out.println(y);
        System.out.println(x);

        int p = 20;
        int q = ++p; // Assignment occures after incrementation
        System.out.println(p);
        System.out.println(q); 

    }

    static void decrement(){
        int x = 10;
        int y = x--; // Assignment occures before decrement
        System.out.println(y);
        System.out.println(x);

        int p = 20;
        int q = --p; // Assignment occures after decrement
        System.out.println(p);
        System.out.println(q); 

    }
}
