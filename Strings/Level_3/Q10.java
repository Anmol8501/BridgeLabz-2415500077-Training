package Strings.Level_3;

import java.util.Scanner;

public class Q10 {
    static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }
        return deck;
    }

    static String[] shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;

        String[][] res = new String[players][cards];
        int k = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                res[i][j] = deck[k++];
            }
        }
        return res;
    }

    static void display(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : players[i]) System.out.println(card);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffle(deck);
        String[][] res = distribute(deck, players, cards);

        if (res != null) display(res);
        sc.close();
    }
}
