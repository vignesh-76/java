// import java.util.Scanner;
// class balancedsymbols{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the String :");
//         String symbu=in.nextLine();
//         int oa=0,oa1=0,ob=0,ob1=0,oc=0,oc1=0;
//         for(int i=0;i<symbu.length();i++){
//             if(symbu.charAt(i)=='{'){
//                 oa++;
//             }
//             else if(symbu.charAt(i)=='}'){
//                 oa1++;
//             }
//             else if(symbu.charAt(i)=='('){
//                 ob++;
//             }
//             else if(symbu.charAt(i)==')'){
//                 ob1++;
//             }
//             else if(symbu.charAt(i)=='['){
//                 oc++;
//             }
//             else if(symbu.charAt(i)==']'){
//                 oc1++;
//             }

//         }
//         if(oa==oa1&&ob==ob1&&oc==oc1){
//             System.out.println("Balanced");
//         }
//         else{
//             System.out.println("Not Balanced");
//         }

        
//     }
// }



import java.util.Scanner;
import java.util.Stack;

class BalancedSymbols {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String symbu = in.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < symbu.length(); i++) {
            char ch = symbu.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == '}' || ch == ')' || ch == ']') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == '}' && top != '{') ||
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        in.close();
    }
}