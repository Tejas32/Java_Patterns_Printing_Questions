// Right Side Half Pyramid

//    *
//   **
//  ***
// ****

public class RightHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop => Rows
        for (int i = 1; i <= n; i++) {
            // Innerloop => To Print Initial Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Innerloop => To Print Starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
