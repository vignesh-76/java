package datastructure.sll;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class sll{
    Node head=null;
    //insert at beginnning
    public void insertatbeg(int data){
    Node temp=new Node(data);
    if(head==null){
        head=temp;
    }
    else{
    temp.next=head;
    head=temp;
    }
    }
    //display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    //insert at middle
    public void insertatmidd(int data,int key){
        Node temp=new Node(data);
        Node prev=head;
        while(prev!=null&&prev.data!=key){
            prev=prev.next;
        }
        if(prev==null){
            System.out.println("Key Not found");
            return;
        }
        temp.next=prev.next;
        prev.next=temp;
    }
    //insert at end
    public void insertatend(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        Node prev=head;
        while(prev.next!=null){
            prev=prev.next;
        }
        prev.next=temp;
    }
    //delete
    public void delete(int key){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.data==key){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&temp.data!=key){
            prev=temp;
          temp=temp.next;
        }
        if(temp == null){
        System.out.println("Key not found");
        return;
    }
        prev.next=temp.next;        
    }
    public void reverse(){
        Node temp=head;
        Stack<Node> s=new Stack<>();
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        while(!s.isEmpty()){
            System.out.println(s.pop().data);
        }
    }
}
class LinklistImplementation{
    public static void main(String[] args) {
        sll list=new sll();
        // list.insertatbeg(20);
        // list.insertatbeg(30);
        // list.insertatbeg(50);
        // list.insertatmidd(40, 30);
        list.insertatend(70);
        list.delete(40);
        list.reverse();
        
        
    }
}