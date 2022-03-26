public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting | Automatic Casting
        int x = 100;
        double y = x;
        System.out.println(y);

        byte p = 4;
        short q = p;
        System.out.println(q);

         // Narrowing Casting | Manual Casting
         double k = 20.5;
         float l = (float)k;
         System.out.println(l);

        float s = 3.5f;
        short r = (short)s;
        System.out.println(r);



    }
}
