package student_performance_analyzer.com.school.main;

import student_performance_analyzer.com.school.util.Analyzer;
import student_performance_analyzer.com.school.data.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Alice", 85, 92, 78);
        Analyzer a = new Analyzer();

        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println(s);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
