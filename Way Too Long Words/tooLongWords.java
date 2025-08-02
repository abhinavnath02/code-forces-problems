import java.util.Scanner;

public class tooLongWords {
    public static String longWords(String input) {
        String wordLength = Integer.toString(input.length() - 2);
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);
        if (input.length() <= 10) {
            return input;
        } else {
            return first + wordLength + last;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of words
        sc.nextLine(); // Consume the rest of the line after reading the integer

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String result = longWords(input);
            System.out.println(result);
        }
        sc.close();

    }
}
