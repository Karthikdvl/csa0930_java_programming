public class AndGateExample19 {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1};
        int[] b = {0, 1, 1, 0, 0};

        // Using product method
        for (int i = 0; i < 5; i++) {
            int product = a[i] * b[i];
            System.out.println(a[i] + " AND " + b[i] + " = " + product);
        }

        // Using & operator
        for (int i = 0; i < 5; i++) {
            int andResult = a[i] & b[i];
            System.out.println(a[i] + " AND " + b[i] + " = " + andResult);
        }

        // Using if-else conditions
        for (int i = 0; i < 5; i++) {
            int ans;
            if (a[i] == 1 && b[i] == 1)
                ans = 1;
            else
                ans = 0;
            System.out.println(a[i] + " AND " + b[i] + " = " + ans);
        }
    }
}
