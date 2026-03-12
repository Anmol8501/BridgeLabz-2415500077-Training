package Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ChallengeProblem1 {
    public static void main(String[] args) throws Exception {

        int count = 1000000;

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("hello");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");

        String file = "C:\\Users\\lenovo\\Desktop\\practice\\Java\\Linear_and_Binary_Search\\sample.txt";

        start = System.currentTimeMillis();
        int words1 = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br1.readLine()) != null) {
            String[] arr = line.split(" ");
            words1 += arr.length;
        }
        br1.close();
        end = System.currentTimeMillis();
        System.out.println("FileReader words: " + words1);
        System.out.println("FileReader time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        int words2 = 0;
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)));

        while ((line = br2.readLine()) != null) {
            String[] arr = line.split(" ");
            words2 += arr.length;
        }
        br2.close();
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader words: " + words2);
        System.out.println("InputStreamReader time: " + (end - start) + " ms");
    }
}
