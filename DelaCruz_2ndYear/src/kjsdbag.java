public class kjsdbag {
    public static void main(String[] args) {
        int n = 5;

        // First part
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print first star
            System.out.print("*");

            // Print spaces between stars
            if (i != 1 && i != n) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                // Print second star
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part
        for (int i = 1; i <= n - 2; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Third part (last line)
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}
