public class DataTypeConversionDemo2 {
    public static void main(String[] args) {
        // Implicit (Widening) Conversions
        int myInt = 100;
        long myLong = myInt; // int to long
        float myFloat = myLong; // long to float

        System.out.println("Implicit (Widening) Conversions:");
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);

        // Explicit (Narrowing) Conversions
        double myDouble = 100.04;
        long myLongExplicit = (long) myDouble; // double to long
        int myIntExplicit = (int) myLongExplicit; // long to int

        System.out.println("\nExplicit (Narrowing) Conversions:");
        System.out.println("Double value: " + myDouble);
        System.out.println("Long value (explicit): " + myLongExplicit);
        System.out.println("Int value (explicit): " + myIntExplicit);

        // Overflow and Underflow
        byte myByte = (byte) 257; // Overflow (value exceeds byte range)
        byte myByteUnderflow = (byte) 128; // Underflow (value below byte range)

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow (byte): " + myByte); // Prints -1 (modulo 256)
        System.out.println("Underflow (byte): " + myByteUnderflow); // Prints -128 (modulo 256)
    }
}
