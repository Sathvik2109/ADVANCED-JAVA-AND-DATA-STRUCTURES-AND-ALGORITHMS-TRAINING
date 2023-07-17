import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Upper pyramid
        for (int i = 1; i <= rows; ++i) {
            // Print spaces
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower pyramid
        for (int i = rows - 1; i >= 1; --i) {
            // Print spaces10
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}