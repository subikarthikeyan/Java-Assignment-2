// Base class representing an individual
class Individual {
    // Attributes
    private String name;
    private int age;

    // Constructor for Individual
    public Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display Individual information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing an employee, inheriting from Individual
class Employee extends Individual {
    // Additional attributes for Employee
    private String employeeID;
    private double salary;

    // Constructor for Employee
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize Individual attributes using super
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Display Employee information
    public void displayInfo() {
        super.displayInfo(); // Display Individual information
        System.out.println("Employee ID: " + employeeID + ", Salary: $" + salary);
    }
}

// Main class to test the implementation
public class CompanyApp {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Alice Johnson", 28, "E67890", 75000.0);

        // Display Employee information
        employee.displayInfo();
    }
}
