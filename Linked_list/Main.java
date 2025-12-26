package Linked_list;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}

class LinkedList{
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        System.out.println("Inserted:" +data);
    }


public void display(){
    System.out.println("Linked List:");
    Node current=head;
    while(current!=null){
        System.out.print(current.data +"->");
        current=current.next;
    }
    System.out.println("null");
}
}

public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(100);
        list.insert(200);
        list.insert(300);
        System.out.println("------------------------------------");
        list.display();
    }
    
}
 