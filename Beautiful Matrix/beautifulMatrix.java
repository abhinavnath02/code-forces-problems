import java.util.Scanner;

public class beautifulMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] input = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(stepsToBeautifulMatrix(input));
        scanner.close();
    }

    public static int stepsToBeautifulMatrix(int[][] matrix) {
        int count = 0;
        int row = 0, col = 0;

        // Find the position of '1'
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        // Calculate the number of moves to center (2,2)
        count += Math.abs(row - 2);
        count += Math.abs(col - 2);

        return count;
    }
}