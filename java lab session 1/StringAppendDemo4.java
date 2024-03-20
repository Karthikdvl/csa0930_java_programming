public class StringAppendDemo4 {
    public static void main(String[] args) {
        int iterations = 1000000; // Number of iterations

        // Using StringBuilder
        long startTimeSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Hello, ");
        }
        long endTimeSB = System.nanoTime();
        long durationSB = endTimeSB - startTimeSB;
        System.out.println("Time taken by StringBuilder: " + durationSB + " ns");

        // Using StringBuffer
        long startTimeSBuff = System.nanoTime();
        StringBuffer sbuff = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuff.append("Hello, ");
        }
        long endTimeSBuff = System.nanoTime();
        long durationSBuff = endTimeSBuff - startTimeSBuff;
        System.out.println("Time taken by StringBuffer: " + durationSBuff + " ns");
    }
}
