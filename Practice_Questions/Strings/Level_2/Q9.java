package Strings.Level_2;

import java.util.Scanner;

public class Q9 {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }

    static String[][] stats(int userWins, int compWins, int games) {
        String[][] arr = new String[2][3];
        arr[0][0] = "User";
        arr[0][1] = String.valueOf(userWins);
        arr[0][2] = String.valueOf((userWins * 100.0) / games);

        arr[1][0] = "Computer";
        arr[1][1] = String.valueOf(compWins);
        arr[1][2] = String.valueOf((compWins * 100.0) / games);

        return arr;
    }

    static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            if (win.equals("User")) userWins++;
            else if (win.equals("Computer")) compWins++;
        }

        String[][] result = stats(userWins, compWins, games);
        display(result);
        sc.close();
    }
}
