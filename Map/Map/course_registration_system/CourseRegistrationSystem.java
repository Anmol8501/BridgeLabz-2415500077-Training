package course_registration_system;
import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 3);
        courses.put("MATH201", 55);
        courses.put("PHY110", 10);
        courses.put("ENG150", 60);

        courses.put("CS101", courses.get("CS101") + 3);   
        courses.put("CS102", Math.max(0, courses.get("CS102") - 2)); 
        courses.put("PHY110", courses.get("PHY110") + 41); 

        System.out.println("Near Full (>=50):");
        for (String c : courses.keySet()) {
            if (courses.get(c) >= 50)
                System.out.println(c + " → " + courses.get(c));
        }

        System.out.println("\nUnder-subscribed (<5):");
        for (String c : courses.keySet()) {
            if (courses.get(c) < 5)
                System.out.println(c + " → " + courses.get(c));
        }
    }
}
