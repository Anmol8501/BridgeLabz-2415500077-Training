package package_hierarchy;

import package_hierarchy.com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course("CSE101", "Introduction to Programming", 4);
        c.displayCourseDetails();
    }
}
