import java.util.Random;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = computeResults(scores);
        displayScorecard(scores, results);
    }

    static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = rand.nextInt(91) + 10;
        return arr;
    }

    static double[][] computeResults(int[][] scores) {
        double[][] res = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
            res[i][0] = Math.round(total * 100.0) / 100.0;
            res[i][1] = avg;
            res[i][2] = percent;
        }
        return res;
    }

    static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%5s%10s%10s%10s%10s%12s%12s\n",
                "No", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%5d%10d%10d%10d%10.2f%12.2f%12.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}
