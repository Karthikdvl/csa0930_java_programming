public class OrGateExample19 {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1};
        int[] b = {0, 1, 1, 0, 0};

        // Using + operator
        for (int i = 0; i < 5; i++) {
            int orResult = (a[i] + b[i] > 0) ? 1 : 0;
            System.out.println(a[i] + " OR " + b[i] + " = " + orResult);
        }

        // Using | operator
        for (int i = 0; i < 5; i++) {
            int orResult = a[i] | b[i];
            System.out.println(a[i] + " OR " + b[i] + " = " + orResult);
        }

        // Using if-else conditions
        for (int i = 0; i < 5; i++) {
            int ans;
            if (a[i] == 1 || b[i] == 1)
                ans = 1;
            else
                ans = 0;
            System.out.println(a[i] + " OR " + b[i] + " = " + ans);
        }
    }
}
