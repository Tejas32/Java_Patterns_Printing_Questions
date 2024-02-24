// Floyd's Triangle Pattern

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                // Increment the number
                number++;
            }
            // Print space to get to next line
            System.out.println();
        }
    }
}
