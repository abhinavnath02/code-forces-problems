import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String operations = scanner.nextLine().trim();
            if (operations.contains("++")) {
                x++;            
            } else if (operations.contains("--")) {
                x--;
            }
        }
        System.out.println(x);

        scanner.close();
    }
}