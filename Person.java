import java.util.Scanner;

class Person1 {
    protected String name;
    protected int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person1 {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(name, age, designation, salary);
            System.out.println();
        }

        System.out.println("Employees with salary greater than 5000:");

        // Display the name of employees with salary greater than 5000
        for (Employee employee : employees) {
            if (employee.getSalary() > 5000) {
                System.out.println(employee.name);
            }
        }
    }
}
