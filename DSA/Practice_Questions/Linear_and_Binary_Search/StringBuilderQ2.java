package Linear_and_Binary_Search;

import java.util.HashSet;

public class StringBuilderQ2 {
    public static void main(String[] args) {
        String input = "programming";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
