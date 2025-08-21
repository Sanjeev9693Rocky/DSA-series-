
public class NumberPyramid {
    public static void Number_Pyramid(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Fixed incorrect syntax
            }

            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");  // Fixed println to print
            }

            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Number_Pyramid(7);  // Fixed incorrect method call
    }
}
