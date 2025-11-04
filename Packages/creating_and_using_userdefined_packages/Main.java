package creating_and_using_userdefined_packages;
import creating_and_using_userdefined_packages.college.student.Student;
import creating_and_using_userdefined_packages.college.faculty.Faculty;


public class Main {
    public static void main(String[] args) {
    Student student = new Student();
    Faculty faculty = new Faculty();
    student.displayStudentName("Alice");
    student.displayStudentRollNo(101);
    faculty.displayFacultyName("Dr. Smith");
    faculty.displayFacultySubject("Mathematics");
    }
}
