abstract class CourseType {
    private String courseName;
    private String courseCode;
    public CourseType(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public String getCourseInfo() {
        return "Course: " + courseName + " (" + courseCode + ")";
    }
    public abstract String getEvaluationMethod();
}
class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String courseCode) {
        super(courseName, courseCode);
    }
    public String getEvaluationMethod() {
        return "Evaluation: Final Exam";
    }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String courseCode) {
        super(courseName, courseCode);
    }
    public String getEvaluationMethod() {
        return "Evaluation: Weekly Assignments";
    }
}
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String courseCode) {
        super(courseName, courseCode);
    }
    public String getEvaluationMethod() {
        return "Evaluation: Research Paper Submission";
    }
}
class Course<T extends CourseType> {
    private T courseType;
    private String instructor;
    public Course(T courseType, String instructor) {
        this.courseType = courseType;
        this.instructor = instructor;
    }
    public T getCourseType() {
        return courseType;
    }
    public String getCourseDetails() {
        return courseType.getCourseInfo() + ", " + courseType.getEvaluationMethod() + ", Instructor: " + instructor;
    }
}
import java.util.ArrayList;
import java.util.List;
class CourseManager {
    public static void displayCourses(List<? extends CourseType> courseList) {
        for (CourseType course : courseList) {
            System.out.println(course.getCourseInfo() + " | " + course.getEvaluationMethod());
        }
    }
}
public class c {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Data Structures", "CSE101"));
        courses.add(new AssignmentCourse("Software Engineering", "CSE202"));
        courses.add(new ResearchCourse("AI Research", "CSE503"));
        System.out.println("University Course Catalog:");
        CourseManager.displayCourses(courses);
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Operating Systems", "CSE303"), "Dr. Smith");
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Web Development", "CSE204"), "Ms. Allen");
        System.out.println("\nDetailed Course Records:");
        System.out.println(examCourse.getCourseDetails());
        System.out.println(assignmentCourse.getCourseDetails());
    }
}