import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class helpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String noPlus = input.replaceAll("\\+", "");
        List<Character> ch = new ArrayList<>();
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < noPlus.length(); i++)
        {
            ch.add(noPlus.charAt(i));
        }

        Collections.sort(ch);

        for (int i = 0; i < ch.size(); i++) {
            sb.append(ch.get(i));
            if (i < ch.size() - 1) {
                sb.append("+"); // Custom delimiter
            }
        }
        String numbersString = sb.toString();
        System.out.println(numbersString);
        sc.close();


        
    }
    
}
