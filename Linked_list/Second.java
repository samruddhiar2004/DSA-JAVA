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

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        System.out.println("Inserted" +data+ "At the Beginning");
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println("Inserted" +data+ "At the End");
            return;
        }

        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        System.out.println("Inserted" +data+ "At the End");
    }

    public void insertAtPosition(int position,int data){
        Node newNode=new Node(data);
        if(position==0){
            insertAtBeginning(data);
            return;
        }

        Node current=head;
        for(int i=0;i<position-1;i++){
            if(current==null){
                System.out.println("Position out of Bound");
                return;
            }
            current=current.next;
            if(current!=null){
                newNode.next=current.next;
                current.next=newNode;
                System.out.println("Inserted" +data+ "Position");
            }
        }

    }


}
