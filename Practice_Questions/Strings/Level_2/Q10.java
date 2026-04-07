package Strings.Level_2;

import java.util.Scanner;

public class Q10 {
    static int[][] generatePCM(int students) {
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            pcm[i][0] = (int)(Math.random() * 100);
            pcm[i][1] = (int)(Math.random() * 100);
            pcm[i][2] = (int)(Math.random() * 100);
        }
        return pcm;
    }

    static double[][] calculateScores(int[][] pcm) {
        double[][] result = new double[pcm.length][4];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static String[] calculateGrades(double[][] scores) {
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double p = scores[i][2];
            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void display(int[][] pcm, double[][] scores, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t" +
                pcm[i][2] + "\t" +
                (int)scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] pcm = generatePCM(students);
        double[][] scores = calculateScores(pcm);
        String[] grades = calculateGrades(scores);
        display(pcm, scores, grades);
        sc.close();
    }
}
