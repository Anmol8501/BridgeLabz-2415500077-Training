package university_course_management;
import java.util.*;

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T c){courses.add(c);}
    public List<T> getCourses(){return courses;}
}