// Half Pyramid Pattern "Star Pattern"

// *
// **
// ***
// ****

public class HalfPyramid {
    public static void main(String args[]) {
        int n = 4;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Inner loop => Columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
