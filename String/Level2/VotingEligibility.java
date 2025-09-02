import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = rand.nextInt(90) + 10;
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s%n", "Age", "CanVote");
        System.out.println("-------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] table = canVote(ages);
        display(table);
    }
}
