package college_admission_system;
import java.util.*;

public class CollegeAdmission {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1️⃣ DATA STRUCTURES
        // -------------------------------------------------------

        // List to store all applicants  [name, marks]
        List<String[]> applicants = new ArrayList<>();

        // Set for shortlisted students
        Set<String[]> shortlisted = new HashSet<>();

        // Queue for interview waiting list
        Queue<String[]> interviewQueue = new LinkedList<>();

        // TreeSet for final merit list (sorted by marks DESC)
        TreeSet<String[]> meritList = new TreeSet<>(
                (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1])
        );


        // -------------------------------------------------------
        // 2️⃣ ACCEPT APPLICATIONS (Add to List)
        // -------------------------------------------------------
        System.out.println("Adding Applicants...");

        applicants.add(new String[]{"Rahul", "92"});
        applicants.add(new String[]{"Sneha", "85"});
        applicants.add(new String[]{"Vikram", "76"});
        applicants.add(new String[]{"Priya", "88"});
        applicants.add(new String[]{"Aman", "60"});

        System.out.println("All Applicants:");
        display(applicants);



        // -------------------------------------------------------
        // 3️⃣ SHORTLIST ELIGIBLE STUDENTS (marks ≥ 80)
        // -------------------------------------------------------
        System.out.println("\nShortlisting Students...");

        for (String[] stu : applicants) {
            int marks = Integer.parseInt(stu[1]);
            if (marks >= 80) {
                shortlisted.add(stu);
                System.out.println("Shortlisted: " + stu[0]);
            }
        }



        // -------------------------------------------------------
        // 4️⃣ ADD SHORTLISTED STUDENTS TO INTERVIEW QUEUE
        // -------------------------------------------------------
        System.out.println("\nInterview Queue Created:");

        for (String[] stu : shortlisted) {
            interviewQueue.add(stu);
            System.out.println("Queued → " + stu[0]);
        }



        // -------------------------------------------------------
        // 5️⃣ PROCESS INTERVIEWS & ADD TO MERIT LIST
        // -------------------------------------------------------
        System.out.println("\nProcessing Interviews...\n");

        while (!interviewQueue.isEmpty()) {
            String[] candidate = interviewQueue.poll();
            System.out.println("Interviewing: " + candidate[0]);

            // Assume everyone who reaches here passes the interview
            meritList.add(candidate);
        }



        // -------------------------------------------------------
        // 6️⃣ DISPLAY MERIT LIST (sorted by marks DESC)
        // -------------------------------------------------------
        System.out.println("\n🏆 Final Merit List:");
        for (String[] s : meritList) {
            System.out.println(s[0] + " - Marks: " + s[1]);
        }
    }

    // Helper method to print list
    private static void display(List<String[]> list) {
        for (String[] s : list) {
            System.out.println(s[0] + " - Marks: " + s[1]);
        }
    }
}
