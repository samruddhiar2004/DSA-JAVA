package Linked_list;

// 1. Node Class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. LinkedList Class
class LinkedList {
    Node head;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Find Middle (The new feature)
    public void findMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 step
            fast = fast.next.next;  // 2 steps
        }
        System.out.println("Middle Element: " + slow.data);
    }

    // Display
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// 3. Main Class (MUST match filename 'studentRecord')
public class StudentRecord {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add 5 items (Odd number)
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.display();
        list.findMiddle(); // Should print 30
    }
}