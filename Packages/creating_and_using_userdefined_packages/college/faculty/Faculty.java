package creating_and_using_userdefined_packages.college.faculty;
public class Faculty {
    String FacultyName;
    String FacultySubject;
    public void displayFacultyName(String name)
    {
        this.FacultyName = name;
        System.out.println("Faculty Name: " + this.FacultyName);
    }
    public void displayFacultySubject(String subject)
    {
        this.FacultySubject = subject;
        System.out.println("Faculty Subject: " + this.FacultySubject);
    }
}