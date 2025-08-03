public class nextRnd{

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int cutoff = scores[k - 1];
        int count = 0;
        for (int score : scores) {
            if (score > 0 && score >= cutoff) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
}
}
