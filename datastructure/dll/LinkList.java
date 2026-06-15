package datastructure.dll;
import java.util.Stack;
class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {

    Node head = null;
//// Insert at beginning
    public void insertAtBeg(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

//// Insert at end
    public void insertEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        Node last = head;

        while (last.next != null) {  
            last = last.next;
        }

        last.next = temp;
        temp.prev = last;
    }
////insert at middle
   public void insertAtMid(int data, int key) {
    Node temp = new Node(data);
    if (head == null) {
        head=temp;
        return;
    }
    Node prev = head;
    // Search for key
    while (prev != null && prev.data != key) {
        prev = prev.next;
    }
    if (prev == null) {
        System.out.println("Key not found");
        return;
    }
    // Insert after key
    temp.next = prev.next;
    temp.prev = prev;
    if (prev.next != null) {
        prev.next.prev = temp;
    }
    prev.next = temp;
}
    

//// insert at end
    public void insertAtEnd(int data){
        Node temp=new Node(data);
        // if(head==null){
        //     head=temp;
        //     return;
        // }
        Node prev=head;
        while(prev.next!=null){
            prev=prev.next;
        }
        prev.next=temp;
        temp.prev=prev;
    }

////deletion
    public void delete(int key) {
    if (head == null) {
        System.out.println("Empty");
        return;
    }
    Node temp = head;
    // Search for key
    while (temp != null && temp.data != key) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Key not found");
        return;
    }
    // Case 1: Deleting head
    if (temp == head) {
        head = temp.next;
        if (head != null) {
            head.prev = null;
        }
        return;
    }
    // Case 2 & 3: Middle or Last
    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }
    if (temp.prev != null) {
        temp.prev.next = temp.next;
    }
}


//// Display
    public void display() {
        Node temp = head;

        while (temp != null) {  
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

///reverse print
public void reverse() {
    if (head == null) {
        System.out.println("Empty");
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    while (temp != null) {
        System.out.println(temp.data);
        temp = temp.prev;
    }
}

public void prreverse(){
        Node temp=head;
        Stack <Node> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().data);

        }
    }
}
public class LinkList {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("After insert at beginning:"); 
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.display();
        System.out.println();
        System.out.println("After insert at End:"); 
        list.insertEnd(5);
        list.display();System.out.println();
        System.out.println("After insertion at Middle");
        list.insertAtMid(56,20);
        list.display();
        System.out.println();
        System.out.println("After deletion");
        list.delete(5);
        list.display();
        System.out.println("Reverse");
        list.prreverse();
    }
}