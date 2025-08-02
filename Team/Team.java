import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solvedCount = 0;

        for (int i = 0; i < n; i++) {
            int sureCount = 0;
            sureCount += sc.nextInt();
            sureCount += sc.nextInt();
            sureCount += sc.nextInt();
            
            if (sureCount >= 2) {
                solvedCount++;
            }
        }
        
        System.out.println(solvedCount);
        sc.close();
    }
}