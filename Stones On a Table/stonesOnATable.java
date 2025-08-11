import java.util.Scanner;
import java.util.Stack;

public class stonesOnATable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        int count = 0;
        scanner.close();
        if (n != string.length()) {
            System.out.println("Enter Valid number of rocks");
        }

        else {
            for (int i = 1; i < string.length(); i++) {
                if (string.charAt(i) == string.charAt(i - 1)) {
                    count++;
                }

            }
            System.out.println(count);

        }

    }
}
