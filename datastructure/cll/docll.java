package datastructure.cll;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class cdl{
    Node head=null;
    public void insertatbe(int data){
    Node temp = new Node(data);
    if(head == null){
        head = temp;
        head.next = head;
        head.prev = head;
        return;
    }
    Node last = head.prev;
    temp.next = head;
    temp.prev = last;
    last.next = temp;
    head.prev = temp;
    head = temp;
}

//insert at middle
public void insertAfter(int key, int data) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    do {
        if (temp.data == key) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            return;
        }
        temp = temp.next;
    } while (temp != head);
    System.out.println("Key not found");
}
//insert at end
public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    // If list is empty
    if (head == null) {
        head = newNode;
        head.next = head;
        head.prev = head;
        return;
    }
    Node last = head.prev;
    newNode.next = head;
    newNode.prev = last;
    last.next = newNode;
    head.prev = newNode;
}
public void delete() {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.next == head) {
        head = null;
        return;
    }
    Node last = head.prev;
    head = head.next;
    head.prev = last;
    last.next = head;
}

//display
public void display() {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    do {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } while (temp != head);
    System.out.println();
}
}



public class docll {
    public static void main(String[] args) {
        cdl list=new cdl();
        // Insert at beginning
        list.insertatbe(30);
        list.insertatbe(20);
        list.insertatbe(10);

        System.out.println("After inserting at beginning:");
        list.display();

        // Insert at end
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("After inserting at end:");
        list.display();

        // Delete at beginning
        list.delete();
        System.out.println("After deleting at beginning:");
        list.display();

    
        
    }
    
}
