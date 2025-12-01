package online_examination_management_system;
import java.util.*;

public class ExamSystem {
    public static void main(String[] args) {

        // -----------------------------
        // 1️⃣ UNIQUE STUDENT ENROLLMENT
        // -----------------------------
        Set<String> studentIDs = new HashSet<>();

        System.out.println("Enrolling Students...");
        studentIDs.add("STU101");
        studentIDs.add("STU102");
        studentIDs.add("STU103");
        studentIDs.add("STU101");   // duplicate → ignored

        System.out.println("Unique Students: " + studentIDs);


        // -----------------------------
        // 2️⃣ ADD & RANDOMIZE QUESTIONS
        // -----------------------------
        List<String> questions = new ArrayList<>();
        questions.add("What is Java?");
        questions.add("What is Polymorphism?");
        questions.add("What is Inheritance?");
        questions.add("Explain Encapsulation.");

        System.out.println("\nBefore Shuffle: " + questions);
        Collections.shuffle(questions);   // randomize
        System.out.println("After Shuffle: " + questions);


        // ----------------------------------------
        // 3️⃣ MANAGE STUDENT EXAM QUEUE (FIFO)
        // ----------------------------------------
        Queue<String> examQueue = new LinkedList<>();

        // Students enter the exam queue
        examQueue.add("STU101");
        examQueue.add("STU102");
        examQueue.add("STU103");

        System.out.println("\nStudents in Exam Queue: " + examQueue);


        // ----------------------------------------
        // 4️⃣ QUESTION NAVIGATION USING STACK
        // ----------------------------------------
        Stack<String> questionStack = new Stack<>();

        System.out.println("\nServing Students...\n");

        while (!examQueue.isEmpty()) {
            String student = examQueue.poll();
            System.out.println("Now serving: " + student);

            // student starts exam → push all questions into stack
            for (String q : questions) {
                questionStack.push(q);
            }

            // simulate navigation
            System.out.println("Answering Questions:");
            while (!questionStack.isEmpty()) {
                String q = questionStack.pop();
                System.out.println("Student answered: " + q);
            }

            System.out.println();
        }

        System.out.println("All students have finished the exam.");
    }
}
