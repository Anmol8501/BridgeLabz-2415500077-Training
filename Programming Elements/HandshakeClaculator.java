import java.util.Scanner;

public class HandshakeClaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Formula: n * (n - 1) / 2
        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of handshakes possible among " + n +" students is: " + handshakes);

        sc.close();
}
}