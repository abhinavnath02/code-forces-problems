import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boyOrGirl {
    public static String boy_or_girl(String name){
        Set<Character> count = new HashSet<>();
        for(char ch: name.toCharArray())
        {
            count.add(ch);
        }
        int numOfUniqueCharacters = count.size();

        return numOfUniqueCharacters % 2 != 0 ? "IGNORE HIM!" : "CHAT WITH HER!";

    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(boy_or_girl(input));

        
    }
}
