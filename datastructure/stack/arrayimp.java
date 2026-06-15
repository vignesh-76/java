package datastructure.stack;
class ar{
    int n=20;
    int  []arr=new int[n];
    int top=-1;
    //insertion
    public void push(int data){
        if(top==n-1){
            System.out.println("Overflolw");
            return;
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    //deletion
   public void pop(){
    if(top == -1){
        System.out.println("Empty");
    }
    else{
        int val = arr[top];
        top--;
        System.out.println("Popped: " + val);
    }
}

   //display
    public void display(){
        if(top == -1){
            System.out.println("Stack Empty");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // peek
    public void peek(){
    if(top == -1){
        System.out.println("Stack Empty");
        return;
    }
    System.out.println("Top element: " + arr[top]);
}
}

public class arrayimp {
    public static void main(String[] args) {
    ar helo=new ar();
    helo.push(20);
    helo.push(10);
    helo.push(90);
    helo.display();
    helo.pop();
    System.out.println();
    helo.display();
    helo.peek();
    }
}
