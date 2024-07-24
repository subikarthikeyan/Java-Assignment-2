import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Default constructor with default age set to 18
    public Person() {
        this.age = 18;
    }

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the name and age of the person
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dynamic input for creating a Person with default age
        System.out.print("Enter name for person with default age: ");
        String defaultName = scanner.nextLine();
        Person person1 = new Person();
        person1.name = defaultName; // Setting the name
        person1.display();

        System.out.println();

        // Dynamic input for creating a Person with specified name and age
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        Person person2 = new Person(name, age);
        person2.display();

        scanner.close();
    }
}
