// Inverted Half Pyramid Pattern "Star Pattern"

// ****
// ***
// **
// *

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Inner loop => Columns
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            // Print space to get to next line
            System.out.println();
        }

        // ---------------------- OR --------------------\\
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
