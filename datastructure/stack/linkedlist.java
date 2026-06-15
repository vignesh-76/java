package datastructure.stack;
class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class stack{
    Node top=null;
    public void push(int data){
        Node temp=new Node(data);
        if(top==null){
            top=temp;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }
    //pop
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            top=top.next;
        }
    }
    //peek
    public void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element"+top.data);
        }
    }
    //display
    public void display(){
        Node  temp=top;
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
            }
        }
    }
}
public class linkedlist {
    public static void main(String[] args) {
        stack st=new stack();
        st.push(23);
        st.push(34);
        System.out.println("After insertion");
        st.display();
        st.pop();
        System.out.println("After deletion:");
        st.display();
        st.peek();

        
        
        
    }
    
}
