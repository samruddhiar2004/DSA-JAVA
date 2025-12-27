package Linked_list;

// 1. Define the Data Object (Student)
class Student {
    String name;
    int rollNo;
    double marks;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Helper method to print student details easily
    public String toString() {
        return "[" + name + " | ID: " + rollNo + " | " + marks + "%]";
    }
}

// 2. Node Class (Now holds a 'Student' object instead of 'int')
class Node {
    Student data;  // Changed from int to Student
    Node next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }
}

// 3. LinkedList Class
class StudentList {
    Node head;

    // Insert a new Student object
    public void insert(String name, int rollNo, double marks) {
        // Create the student object first
        Student newStudent = new Student(name, rollNo, marks);
        // Put it inside a Node
        Node newNode = new Node(newStudent);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted: " + name);
    }

    // Display the list
    public void display() {
        System.out.println("\n--- Student Records ---");
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString()); // Prints the student details
            System.out.println("   |");
            System.out.println("   V");
            current = current.next;
        }
        System.out.println("  null\n");
    }
}

// 4. Main Class (Must match filename 'studentRecord')
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        // Inserting students directly
        list.insert("Amit", 101, 85.5);
        list.insert("Priya", 102, 92.0);
        list.insert("Rahul", 103, 76.4);

        // Show the records
        list.display();
    }
}