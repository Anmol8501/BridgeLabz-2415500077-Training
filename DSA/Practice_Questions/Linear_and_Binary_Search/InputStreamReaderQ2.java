package Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderQ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("C:\\Users\\lenovo\\Desktop\\practice\\Java\\Linear_and_Binary_Search\\sample.txt");

        String input;
        while (true) {
            input = br.readLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            fw.write(input + "\n");
        }

        fw.close();
    }
}
