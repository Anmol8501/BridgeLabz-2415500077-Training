package try_with_resources;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
