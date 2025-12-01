package exam_results__topper_per_subject;
import java.util.*;

public class ExamResults {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Amit", 88);
        math.put("Neha", 95);
        math.put("Rohan", 76);

        Map<String, Integer> science = new HashMap<>();
        science.put("Amit", 92);
        science.put("Neha", 89);
        science.put("Rohan", 91);

        data.put("Math", math);
        data.put("Science", science);

        for (String subject : data.keySet()) {
            Map<String, Integer> marks = data.get(subject);
            String topper = Collections.max(marks.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("Topper in " + subject + ": " + topper);
        }

        for (String subject : data.keySet()) {
            Map<String, Integer> marks = data.get(subject);
            double avg = marks.values().stream().mapToInt(x -> x).average().orElse(0);
            System.out.println("Average in " + subject + ": " + avg);
        }

        System.out.println("\nSubjects with a score > 90:");
        for (String subject : data.keySet()) {
            boolean found = data.get(subject).values().stream().anyMatch(x -> x > 90);
            if (found) System.out.println(subject);
        }
    }
}
