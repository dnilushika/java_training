public class AssignmentOperators {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        y += x;
        System.out.println(y);

        // Excercise -= / *= / /= / %=
        int a = 8;
        int b = 2;
        b -= a;
        System.out.println(b);   
        
        int d = 5;
        int e = 2;
        e *= d;
        System.out.println(e);

        int f = 2;
        int g = 10;
        g /= f;
        System.out.println(g);


        int h = 12;
        int i = 5;
        i %= h;
        System.out.println(i);

        // Strings
        String f_name = "Dilini";
        String l_name = " Nanayakkara";
        String fullname = "";
        fullname += f_name;
        fullname += l_name;
        System.out.println(fullname);
        
    }
 
}
