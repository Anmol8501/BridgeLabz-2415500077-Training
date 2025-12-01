package university_course_management;
import java.util.*;

class University {
    public static void printCourses(List<? extends CourseType> list){
        list.forEach(System.out::println);
    }

    public static void main(String[] args){
        Course<ExamCourse> exam = new Course<>();
        exam.addCourse(new ExamCourse("Mathematics"));
        printCourses(exam.getCourses());
    }
}