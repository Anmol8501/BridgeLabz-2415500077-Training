public class pen_distribution {
    public static void main(String[] args) {
        int totalPens = 14; // Total number of pens
        int students = 3; // Number of students
        int pensPerStudent = totalPens / students; // Calculate pens per student
        int remainingPens = totalPens % students; // Calculate remaining pens

        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
    
}
