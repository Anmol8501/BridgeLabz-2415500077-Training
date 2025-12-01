package university_course_management;

abstract class CourseType { String name; CourseType(String n){name=n;} public String toString(){return name;} }
class ExamCourse extends CourseType { ExamCourse(String n){super(n);} }
class AssignmentCourse extends CourseType { AssignmentCourse(String n){super(n);} }