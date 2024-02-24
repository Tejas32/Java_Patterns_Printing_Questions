// Inverted Half Pyramid Numbers

// 12345
// 1234
// 123
// 12
// 1

public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Inner loop => Columns
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            // Print space to enter next line
            System.out.println();
        }
    }
}