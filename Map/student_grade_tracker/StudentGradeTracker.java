package student_grade_tracker;
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> gradeMap = new HashMap<>();

        // 1️⃣ Add students
        gradeMap.put("Aman", 85.5);
        gradeMap.put("Riya", 92.0);
        gradeMap.put("Karan", 76.0);
        gradeMap.put("Sneha", 88.5);

        System.out.println("Initial Grades: " + gradeMap);

        gradeMap.put("Karan", 82.0); 

        System.out.println("After Updating Karan's Grade: " + gradeMap);

        gradeMap.remove("Riya");

        System.out.println("After Removing Riya: " + gradeMap);

        System.out.println("\nSorted Student Grades:");
        gradeMap.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> 
                System.out.println(entry.getKey() + " → " + entry.getValue())
            );
    }
}
