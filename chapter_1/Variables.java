public class Variables {
    public static void main(String[] args) {
        // Variable declaration
        int variableName = 5; // Assignment allwaysfrom Right to Left
        variableName = 10;
        System.out.println(variableName);

        // Constant variables
        final int radius = 10;
        System.out.println(radius);

        // Variable Identifiers

        // Good
        final int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
        int M = 60;

    }
    
}
