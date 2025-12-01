package student_attendance_tracker;
import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Amit", "Riya", "Sohan", "Priya", "Kunal");

        for (String s : students) {
            attendance.put(s, 0);
        }

        List<List<String>> dailyAttendance = Arrays.asList(
            Arrays.asList("Amit", "Riya", "Sohan"),
            Arrays.asList("Amit", "Priya"),
            Arrays.asList("Riya", "Kunal"),
            Arrays.asList("Amit", "Sohan", "Kunal"),
            Arrays.asList("Priya"),
            Arrays.asList("Amit", "Sohan"),
            Arrays.asList("Riya", "Kunal"),
            Arrays.asList("Amit", "Priya", "Sohan"),
            Arrays.asList("Sohan", "Kunal"),
            Arrays.asList("Amit"),
            Arrays.asList("Riya", "Priya"),
            Arrays.asList("Amit", "Sohan"),
            Arrays.asList("Amit", "Kunal"),
            Arrays.asList("Riya", "Sohan"),
            Arrays.asList("Priya", "Kunal")
        );

        for (List<String> presentStudents : dailyAttendance) {
            for (String student : presentStudents) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("Final Attendance After 15 Days:");
        for (var entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " days");
        }

        System.out.println("\nStudents with < 10 days attendance:");
        attendance.entrySet().stream()
                .filter(e -> e.getValue() < 10)
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
