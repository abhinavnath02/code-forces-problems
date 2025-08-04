import java.util.Scanner;

public class stringTask {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lowercase = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowercase.length(); i++) {
            char currentChar = lowercase.charAt(i);
            if (!isVowel(currentChar)) {
                sb.append('.');
                sb.append(currentChar);
            }
        }

        System.out.println(sb.toString());
        sc.close();

    }
}
