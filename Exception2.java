class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }

        if (name.matches(".*\\d.*") || name.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            student1.display();

            Student student2 = new Student(2, "Jane123", 22, "Electrical Engineering");
            student2.display();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
