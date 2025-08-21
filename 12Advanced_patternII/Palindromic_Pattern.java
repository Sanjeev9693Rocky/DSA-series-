
public class Palindromic_Pattern {
    public static void palindromic_pattern_with_numbers(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Fixed incorrect syntax
            }

            // Descending order
            for (int j = i; j >= 1; j--) {  // Fixed logic: j should start from i, not 1
                System.out.print(j);
            }

            // Ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromic_pattern_with_numbers(5);
    }
}


