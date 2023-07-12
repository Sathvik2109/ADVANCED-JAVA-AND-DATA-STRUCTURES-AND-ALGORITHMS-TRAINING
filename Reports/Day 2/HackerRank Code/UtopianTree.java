import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases > 0) {
            int cycles = scanner.nextInt();
            int height = calculateHeight(cycles);
            System.out.println(height);
            testCases--;
        }
        
        scanner.close();
    }
    
    public static int calculateHeight(int cycles) {
        int height = 1;
        
        for (int i = 0; i < cycles; i++) {
            if (i % 2 == 0) {
                // Spring cycle: double the height
                height *= 2;
            } else {
                // Summer cycle: increase height by 1 meter
                height += 1;
            }
        }
        
        return height;
    }
}