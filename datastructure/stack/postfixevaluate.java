package datastructure.stack;
import java.util.Stack;
public class postfixevaluate {
    public static void main(String[] args) {
    String s1="532/-252*-7++";
    Stack <Integer> s=new Stack <> ();
    for(int i=0;i<s1.length();i++){
        char c=s1.charAt(i);
        if(Character.isDigit(c)){
            s.push(c-'0');
        }
        else{
            int b=s.pop();
            int a=s.pop();
            switch(c){
                case '+':
                    s.push(a+b);break;
                    case '-':
                    s.push(a-b);break;
                    case '*':
                    s.push(a*b);break;
                    case '/':
                    s.push(a/b);break;
                    case '^':
                    s.push((int)Math.pow(a,b));break;
                    default:
                    System.out.print("invalid expression");
                    return;
            }
        }
    }
    System.out.println(s.pop());   
}
}