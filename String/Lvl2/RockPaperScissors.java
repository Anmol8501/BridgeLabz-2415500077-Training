import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            if (winner.equals("user")) { userWins++; System.out.println("You win!"); }
            else if (winner.equals("computer")) { compWins++; System.out.println("Computer wins!"); }
            else System.out.println("It's a draw!");
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
        System.out.println("User win %: " + (userWins * 100.0 / n));
        System.out.println("Computer win %: " + (compWins * 100.0 / n));
    }
}
