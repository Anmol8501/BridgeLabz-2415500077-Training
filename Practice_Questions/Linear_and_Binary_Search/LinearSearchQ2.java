package Linear_and_Binary_Search;

public class LinearSearchQ2 {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "I love programming"
        };

        String word = "love";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}
