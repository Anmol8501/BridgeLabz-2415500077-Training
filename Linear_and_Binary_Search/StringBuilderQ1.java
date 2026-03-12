package Linear_and_Binary_Search;

public class StringBuilderQ1 {
    public static void main(String[] args) {
        String input = "hello";

        StringBuilder sb = new StringBuilder();
        sb.append(input);

        sb.reverse();

        String result = sb.toString();
        System.out.println(result);
    }
}
