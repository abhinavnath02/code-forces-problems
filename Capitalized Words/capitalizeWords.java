import java.util.Scanner;

public class capitalizeWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String capitalizedString = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        System.out.println(capitalizedString);
        sc.close();


    }
}