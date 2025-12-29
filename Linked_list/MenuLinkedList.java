package Linked_list;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // 1. Insert at End
    public void insert(int data) {
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
        System.out.println("--> Inserted " + data);
    }

    // 2. Delete a specific value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head is the node to delete
        if (head.data == key) {
            head = head.next;
            System.out.println("--> Deleted " + key);
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("--> Element not found.");
        } else {
            prev.next = current.next; // Unlink
            System.out.println("--> Deleted " + key);
        }
    }

    // 3. Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class MenuLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice, data;

        System.out.println("=== Linked List Menu ===");
        
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to insert: ");
                    data = sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter number to delete: ");
                    data = sc.nextInt();
                    list.delete(data);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Ends the program
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}