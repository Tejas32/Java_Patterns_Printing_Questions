// Hollow Rectangle Pattern "Star Pattern"

// ****
// *  *
// *  *
// ****

public class HollowRectangle {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Inner loop => Columns
            for (int j = 1; j <= m; j++) {
                // If else Conditions
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
