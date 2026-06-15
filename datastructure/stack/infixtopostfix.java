package datastructure.stack;
//     int top = -1;
//     char arr[] = new char[30];
//     public void push(char c) {
//         arr[++top] = c;
//     }
//     public char pop() {
//         return arr[top--];
//     }
//     public char peek() {
//         return arr[top];
//     }
//     public boolean isempty() {
//         return top == -1;
//     }
//     public int precedence(char c) {
//     //     if (c == '+' || c == '-')
//     //         return 1;
//     //     else if (c == '*' || c == '/')
//     //         return 2;
//     //     else if (c == '^')
//     //         return 3;
//     //     else
//     //         return -1;
//     // }
//         return switch (c) {
//             case '+', '-' -> 1;
//             case '*', '/' -> 2;
//             case '^' -> 3;
//             default -> -1;
//         };
//     }
// }

// public class infixtopostfix {
//     public static void main(String[] args) {
//         String infix = "(a+b-d)/(e-f)+g";
//         String postfix = "";
//         Stack s = new Stack();
//         for (int i = 0; i < infix.length(); i++) {
//             char c = infix.charAt(i);
//             if (Character.isLetterOrDigit(c)) {
//                 postfix = postfix + c;
//             }
//             else if (c == '(') {
//                 s.push(c);
//             }
//             else if (c == ')') {
//                 while (!s.isempty() && s.peek() != '(') {
//                     postfix = postfix + s.pop();
//                 }
//                 s.pop();
//             }
//             else {
//                 while (!s.isempty() && s.precedence(c) <= s.precedence(s.peek())) {
//                     postfix = postfix + s.pop();
//                 }
//                 s.push(c);
//             }
//         }
//         while (!s.isempty()) {
//             postfix = postfix + s.pop();
//         }
//         System.out.println("Postfix Expression: " + postfix);
//     }
// }

class Stack{
    int top=-1;
    char []arr=new char[20];
    public void push(char c){
        arr[++top]=c;
    }
    public char pop(){
        return arr[top--];
    }
    public char peek(){
        return arr[top];
    }
    public boolean isempty(){
        return top==-1;
    }
    public int precendence(char c){
        if(c=='+'||c=='-'){
            return 1;
        }
        else  if(c=='*'||c=='/'){
            return 2;
        }
        else if(c=='^'){
            return 3;
        }
        else{
            return -1;
        }
    }
}
class  infixtopostfix{
    public static void main(String[] args) {
    String infix="a-b/c+(d-a*c+f)";
    String postfix="";
    Stack s=new Stack();
    for(int i=0;i<infix.length();i++){
        char c=infix.charAt(i);
        if(Character.isLetterOrDigit(c)){
            postfix+=c;
        }
        else if(c=='('){
            s.push(c);
        }
        else if(c==')'){
            while(!s.isempty()&&s.peek()!='('){
                postfix+=s.pop();
            }
            s.pop();
        }
        else{
            while(!s.isempty()&&s.precendence(c)<=s.precendence(s.peek())){
                postfix+=s.pop();
            }
            s.push(c);
        }
    }
    while(!s.isempty()){
        postfix+=s.pop();
    }
    System.out.println("Posfix:"+postfix);

    }
}