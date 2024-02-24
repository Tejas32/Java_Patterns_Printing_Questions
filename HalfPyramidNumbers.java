// Half Pyramid Numbers

// 1
// 12
// 123
// 1234
// 12345

public class HalfPyramidNumbers {
    public static void main(String args[]) {
        int n = 5;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Inner loop => Columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j);// print J values
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}