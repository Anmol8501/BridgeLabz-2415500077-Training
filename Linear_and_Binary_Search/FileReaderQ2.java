package Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderQ2 {
    public static void main(String[] args) throws IOException {
        String target = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Desktop\\practice\\Java\\Linear_and_Binary_Search\\sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Occurrences: " + count);
    }
}
