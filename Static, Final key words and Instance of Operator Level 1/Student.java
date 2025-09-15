class Student {
    static String universityName = "State University";
    private static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
        }
    }
}
