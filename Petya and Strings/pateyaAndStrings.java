
import java.util.Scanner;
//** takes two inputs, compares them lexicographically, if smaller -1, if larger 1, if equal 0 */

public class pateyaAndStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        sc.close();
        int result = first.compareToIgnoreCase(second);
        if (result < 0) {
            result = -1;
        } else if (result > 0) {
            result = 1;
        } else {
            result = 0;
        }
         // Print the result
         // System.out.println(result);
         // return result;
         // or just print it directly
        System.out.println(result);
    }
}