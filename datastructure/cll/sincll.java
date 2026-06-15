package datastructure.cll;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CLL {
    Node head = null;
    public void insertAtBeg(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            temp.next = head;   
            return;
        }
        Node h = head;
        while (h.next != head) {
            h = h.next;
        }

        temp.next = head;
        h.next = temp;
        head = temp;
    }


    //insert at end
    public void insertatend(int data){
    Node temp = new Node(data);
        if (head == null) {
            head = temp;
            temp.next = head;   
            return;
        }
        Node h = head;
        while (h.next != head) {
            h = h.next;
        }
        h.next=temp;
        temp.next=head;
    }

    //insert at Middle
    public void insertatmid(int data,int key){
        Node temp=new Node(data);
        if (head == null) {
            head = temp;
            temp.next = head;   
            return;
        }
        Node h=head;
        while(h.data!=key){
            h=h.next;
        }
        temp.next=h.next;
        h.next=temp;

    }

    //delete
    public void delete(int key) {
    if (head == null) {
        System.out.println("Empty");
        return;
    }
    Node curr = head;
    Node prev = null;
    // If head is to be deleted
    if (head.data == key) {
        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }
        // Find last node
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        head = head.next;
        last.next = head;
        return;
    }
    // Search node
    while (curr.next != head && curr.data != key) {
        prev = curr;
        curr = curr.next;
    }
    if (curr.data != key) {
        System.out.println("Not found");
        return;
    }
    prev.next = curr.next;
}
    //display
    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

public class sincll {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);

        System.out.println("After insert at beginning:");
        list.display();
        System.out.println();

        // Insert at end
        list.insertatend(40);
        list.insertatend(50);

        System.out.println("After insert at end:");
        list.display();
        System.out.println();

        // Insert after key
        list.insertatmid(12, 40);
        System.out.println("After insert at mid:");
        list.display();
        System.out.println();

        // Delete a node
        list.delete(27);

        System.out.println("After deletion:");
        list.display();
    }
}