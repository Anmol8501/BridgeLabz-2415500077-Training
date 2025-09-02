import java.util.Random;

public class StudentGrades {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // physics
            scores[i][1] = rand.nextInt(41) + 60; // chemistry
            scores[i][2] = rand.nextInt(41) + 60; // maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((avg) * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 90)
                grades[i] = "A";
            else if (p >= 80)
                grades[i] = "B";
            else if (p >= 70)
                grades[i] = "C";
            else if (p >= 60)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n",
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
    }
}
