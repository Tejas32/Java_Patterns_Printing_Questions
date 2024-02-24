// Solid Rectangle Pattern "Star Pattern"

// *****
// *****
// *****
// *****

public class SolidRectangle {
    public static void main(String args[]) {

        // Outer loop => Rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop => Columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
