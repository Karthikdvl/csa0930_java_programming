public class StringDemo3 {
    public static void main(String[] args) {
        // String Constructors
        String emptyString = new String(); // Creates an empty string
        String fromAnotherString = new String("Hello, World!"); // Creates from another string
        byte[] byteArray = {72, 101, 108, 108, 111};
        String fromByteArray = new String(byteArray); // Creates from a byte array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String fromCharArray = new String(charArray); // Creates from a character array
        int[] codePoints = {65, 66, 67};
        String fromCodePoints = new String(codePoints, 0, codePoints.length); // Creates from code points
        StringBuffer buffer = new StringBuffer("Hello");
        String fromBuffer = new String(buffer); // Creates from a StringBuffer

        // Displaying the created strings
        System.out.println("Empty String: " + emptyString);
        System.out.println("From Another String: " + fromAnotherString);
        System.out.println("From Byte Array: " + fromByteArray);
        System.out.println("From Character Array: " + fromCharArray);
        System.out.println("From Code Points: " + fromCodePoints);
        System.out.println("From StringBuffer: " + fromBuffer);

        // Commonly Used String Methods
        String sampleString = "Java Programming";
        System.out.println("\nCommon String Methods:");
        System.out.println("Length: " + sampleString.length());
        System.out.println("Character at index 5: " + sampleString.charAt(5));
        System.out.println("Substring from index 3 to 8: " + sampleString.substring(3, 8));
        System.out.println("Concatenated with ' Rocks!': " + sampleString.concat(" Rocks!"));
        System.out.println("Equals 'Java Programming': " + sampleString.equals("Java Programming"));
        System.out.println("Uppercase: " + sampleString.toUpperCase());
        System.out.println("Lowercase: " + sampleString.toLowerCase());
        System.out.println("Trimmed: " + "   Hello, World!   ".trim());
        System.out.println("Index of 'Programming': " + sampleString.indexOf("Programming"));
        System.out.println("Replaced 'Java' with 'Python': " + sampleString.replace("Java", "Python"));
        System.out.println("Split by space: " + String.join(", ", sampleString.split(" ")));
    }
}
