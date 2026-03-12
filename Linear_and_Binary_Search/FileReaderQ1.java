package Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderQ1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\lenovo\\Desktop\\practice\\Java\\Linear_and_Binary_Search\\sample.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
