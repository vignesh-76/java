package practice;
import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class sl {
    Node head = null;

    // Insert at beginning
    public void insertatbeg(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Insert after a given key
    public void insertatmidd(int data, int key) {
        Node temp = new Node(data);
        Node prev = head;
        while (prev != null && prev.data != key) {
            prev = prev.next;
        }
        if (prev == null) {
            System.out.println("Key not found");
            return;
        }
        temp.next = prev.next;
        prev.next = temp;
    }

    // Insert at end
    public void insertatend(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
        prev.next = temp;
    }

    // Delete a node by key
    public void delete(int key) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // Case 1: delete head
        if (head.data == key) {
            head = head.next;
            return;
        }

        // Case 2: delete non-head
        Node prev = null;
        Node temp = head;

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        prev.next = temp.next;
    }

    // Find middle using fast/slow pointer
    // public void middle() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     Node slow = head;
    //     Node fast = head;

    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     System.out.println("Middle element: " + slow.data);
    // }

    // Reverse using stack
    public void reverse() {
        Node temp = head;
        Stack<Node> s = new Stack<>();
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop().data);
        }
    }
}

public class lli {
    public static void main(String[] args) {
        sl list = new sl();
        list.insertatbeg(20);
        list.insertatbeg(30);
        list.insertatbeg(40);
        list.delete(40);   // delete head
        // list.middle();     // find middle
        list.reverse();    // print reversed order
    }
}
