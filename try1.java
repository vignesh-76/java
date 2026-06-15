class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
class linli{
    Node head=null;
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
    public void findmiddle(){
        Node temp=head;int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        Node prev=head;
        for(int i=1;i<count/2;i++){
            prev=prev.next;
        }
        System.out.println(prev.data);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
class try1{
    public static void main(String[] args) {
        linli list=new linli();
        list.insertatbeg(10);
        list.insertatbeg(20); 
        list.insertatbeg(30);
        list.insertatbeg(40);
        list.findmiddle();
        list.display();

    }
}