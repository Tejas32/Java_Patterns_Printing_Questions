// 0-1 Triangle Pattern

// 1
// 01
// 101
// 0101
// 10101

public class zero_one_triangle {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                // If modulo returns 0 then the number is even else odd
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
