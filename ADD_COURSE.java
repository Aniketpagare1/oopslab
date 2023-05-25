import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class ADD_COURSE {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 10);

        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        // Display courses
        student.displayCourses();

        // Remove a course
        student.removeCourse("Science");

        // Display courses again
        student.displayCourses();
    }
}
