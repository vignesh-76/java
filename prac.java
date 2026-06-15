

// public class prac {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the hexadecimal number:");
//         String hex = in.nextLine();
//         int decimal = 0;
//         int power = 0;
//         for(int i = hex.length() - 1; i >= 0; i--) {
//             char ch = hex.charAt(i);
//             int value;

//             if(ch >= '0' && ch <= '9') {
//                 value = ch - '0';
//             } else {
//                 value = ch - 'A' + 10;
//             }

//             decimal += value * Math.pow(16, power);
//             power++;
//         }

//         System.out.println("The decimal value is: " + decimal);
//     }
// }


//decimal to hexadecimal without using built in functions and reversing the string
// class prac {
//     public static void main(String[] args) {
//         int decimal = 255;
//         StringBuilder hex = new StringBuilder();
        
//         while (decimal > 0) {
//             int remainder = decimal % 16;
//             char hexDigit;
            
//             if (remainder < 10) {
//                 hexDigit = (char) (remainder + '0');
//             } else {
//                 hexDigit = (char) (remainder - 10 + 'A');
//             }
            
//             hex.append(hexDigit);
//             decimal /= 16;
//         }
        
//         System.out.println("The hexadecimal value is: " + hex.reverse().toString());
//     }
// }



// import java.util.Scanner;

// class prac {
//     public static void main(String[] args) {

//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter decimal number 1:");
//         int d1 = in.nextInt();

//         System.out.println("Enter decimal number 2:");
//         int d2 = in.nextInt();

//         String h1 = toHex(d1);
//         String h2 = toHex(d2);

//         String hexSum = addHex(h1, h2);

//         int finalDecimal = Integer.parseInt(hexSum, 16);

//         System.out.println("Hex 1: " + h1);
//         System.out.println("Hex 2: " + h2);
//         System.out.println("Hex Addition Result: " + hexSum);
//         System.out.println("Final Answer in Decimal: " + finalDecimal);
//     }

//     public static String toHex(int num) {
//         StringBuilder hex = new StringBuilder();

//         while (num > 0) {
//             int rem = num % 16;
//             if (rem < 10)
//                 hex.append((char)(rem + '0'));
//             else
//                 hex.append((char)(rem - 10 + 'A'));

//             num = num / 16;
//         }

//         return hex.reverse().toString();
//     }

//     public static String addHex(String h1, String h2) {

//         StringBuilder result = new StringBuilder();

//         int i = h1.length() - 1;
//         int j = h2.length() - 1;
//         int carry = 0;

//         while (i >= 0 || j >= 0 || carry > 0) {

//             int val1 = 0;
//             int val2 = 0;

//             if (i >= 0) {
//                 char c1 = h1.charAt(i);
//                 if (c1 >= '0' && c1 <= '9')
//                     val1 = c1 - '0';
//                 else
//                     val1 = c1 - 'A' + 10;
//                 i--;
//             }

//             if (j >= 0) {
//                 char c2 = h2.charAt(j);
//                 if (c2 >= '0' && c2 <= '9')
//                     val2 = c2 - '0';
//                 else
//                     val2 = c2 - 'A' + 10;
//                 j--;
//             }

//             int sum = val1 + val2 + carry;
//             carry = sum / 16;
//             int digit = sum % 16;

//             if (digit < 10)
//                 result.append((char)(digit + '0'));
//             else
//                 result.append((char)(digit - 10 + 'A'));
//         }

//         return result.reverse().toString();
//     }
// }








// import java.util.Scanner;

// public class prac {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter number 1:");
//         String s1 = in.nextLine();
//         System.out.println("Enter number 2:");
//         String s2 = in.nextLine();
//         StringBuilder result = new StringBuilder();
//         int i = s1.length() - 1;
//         int j = s2.length() - 1;
//         int carry = 0;
//         while (i >= 0 || j >= 0 || carry > 0) {
//             int digit1 = 0;
//             int digit2 = 0;
//             if (i >= 0) {
//                 digit1 = s1.charAt(i) - '0';
//                 i--;
//             }
//             if (j >= 0) {
//                 digit2 = s2.charAt(j) - '0';
//                 j--;
//             }
//             int sum = digit1 + digit2 + carry;
//             result.append(sum % 10);
//             carry = sum / 10;
//         }
//         System.out.println("Sum is: " + result.reverse().toString());
//     }
// }
// import java.util.Scanner;
// class prac
// {
//     public static void main(String[] args) {
//         int sumeven=0;
//         int odd=0;
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//                 sumeven+=i;
//             }
//             else if(i%2!=0){
//                 System.out.println(i);
//                 odd +=i;
//             }
            
            
//         }
//         System.out.println("sum even :"+sumeven);
//         System.out.println("sum odd :"+odd);
        
//     }
// }

// import java.util.Scanner;
// class prac{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int [] a={2,3,5,1,7};
//         int target=8;
//         int sum=0;
//         for(int i=0;i<a.length-1;i++){
//             for(int j=i+1;j<a.length;j++){
//             sum=a[i]+a[j];
//             if(sum==target){
//                 System.out.println(a[i]+" "+a[j]);
//             }
//         } 
//     }
// }
// }

// import java.util.Scanner;
// class prac{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int [] a={1,2,3,4};
//         int [] b=new int[a.length];
//         for(int i=0;i<a.length;i++){
//             int product=1;
//             for(int j=0;j<a.length;j++){
//                 if(i!=j){
//                     product*=a[j];
//                 }
//                 b[i]=product;

//             }
//         }
//         for(int i=0;i<b.length;i++){
//         System.out.println(b[i]);
//         }
//     }
// }

// class prac{
//     public static void main(String[] args) {
//         int []  a={-2,1,-3,4,-1,2,1,-5,4};
//         int max=0;
       
//         for(int i=0;i<a.length;i++){
//             int sum=0;
//             for(int j=i;j<a.length;j++){
//                 sum+=a[j];
//                 if(max<sum){
//                     max=sum;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }

// class prac {
//     public static void main(String[] args) {
//         String s = "loveleetcode";
//         int index = -1;
//         for (int i = 0; i < s.length(); i++) {
//             boolean unique = true;
//             for (int j = 0; j < s.length(); j++) {
//                 if (i != j && s.charAt(i) == s.charAt(j)) {
//                     unique = false;
//                     break;
//                 }
//             }
//             if (unique) {
//                 index = i;
//                 break;
//             }
//         }
//         System.out.println(index);
//     }
// }

// import java.util.Arrays;
// class prac{
//     public static void main(String[] args) {
//         String s1="earthff";
//         String s2="heartff";
//         boolean de=true;
        
//         if(s1.length()!=s2.length()){
//             System.out.println("Not a Anagram");
//             return;
//         }
//         char [] ar1=s1.toCharArray();
//         char [] ar2=s2.toCharArray();
//         Arrays.sort(ar1);
//         Arrays.sort(ar2);
//         for(int i=0;i<ar1.length;i++){
//                 if(ar1[i]!=ar2[i]){
//                     de=false;

//                 }           
//         }
//         if(de){
//             System.out.println("Anagram");
//         }
//         else{
//             System.out.println("Not a anagram");
//         }

//     }
// }
// class prac {
//     public static void main(String[] args) {

//         String b1 = "157";
//         String b2 = "23";

//         StringBuilder result = new StringBuilder();

//         int i = b1.length() - 1;
//         int j = b2.length() - 1;
//         int carry = 0;

//         while (i >= 0 || j >= 0 || carry != 0) {

//             int sum = carry;

//             if (i >= 0) {
//                 sum += b1.charAt(i) - '0';
//                 i--;
//             }

//             if (j >= 0) {
//                 sum += b2.charAt(j) - '0';
//                 j--;
//             }

//             result.append(sum % 8);   // remainder
//             carry = sum / 8;          // carry
//         }

//         System.out.println(result.reverse().toString());
//     }
// }

// class prac{
//     public static void main(String[] args) {
//         String b1="157";
//         String b2="23";
//         StringBuilder result=new StringBuilder();
//         int i=b1.length()-1;
//         int j=b2.length()-1;
//         int carry=0;
//         while(i>=0||j>=0||carry!=0){
//             int sum=carry;
//             if(i>=0){
//                 sum+=b1.charAt(i)-'0';
//                 i--;
//             }
//             if(j>=0){
//                 sum+=b2.charAt(j)-'0';
//                 j--;
//             }
//             result.append(sum%8);
//             carry=sum/8;
//         }
//         System.out.println(result.reverse().toString());

//     }
// }

// class prac {
//     public static void main(String[] args) {

//         String h1 = "1A3";
//         String h2 = "2F";

//         StringBuilder result = new StringBuilder();

//         int i = h1.length() - 1;
//         int j = h2.length() - 1;
//         int carry = 0;

//         while (i >= 0 || j >= 0 || carry != 0) {

//             int sum = carry;

//             if (i >= 0) {
//                 sum += hexToDecimal(h1.charAt(i));
//                 i--;
//             }

//             if (j >= 0) {
//                 sum += hexToDecimal(h2.charAt(j));
//                 j--;
//             }

//             result.append(decimalToHex(sum % 16));
//             carry = sum / 16;
//         }

//         System.out.println(result.reverse().toString());
//     }

//     static int hexToDecimal(char ch) {
//         if (ch >= '0' && ch <= '9')
//             return ch - '0';
//         else
//             return ch - 'A' + 10;
//     }

//     static char decimalToHex(int num) {
//         if (num < 10)
//             return (char)(num + '0');
//         else
//             return (char)(num - 10 + 'A');
//     }
// }

// import java.util.Scanner;
// class prac{
//     public static void main(String[] args) {
//        int [][]a={{1,2,3},{5,6,7},{8,9,4}};
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the no od the rotation:");
//        int n=in.nextInt();
//        for(int i=0;i<n;i++){
//         for(int k=a.length-1;k>=0;k--){
//             int ji=a[k][a[k].length-1];
//         for(int j=a[k].length-1;j>0;j--){
//             a[k][j]=a[k][j-1];
//         }
//         a[k][0]=ji;
//        }
//     }

    
//     for(int i=0;i<a.length;i++){
//         for(int j=0;j<a[i].length;j++){
//             System.out.print(a[i][j]);
//         }
//         System.out.println();
//     }
// }}
// import java.util.*;
// class prac {
//     public static void main(String[] args) {

//         int n = 4568;
//         String num = String.valueOf(n);
//         int[] a = new int[num.length()];
//         for(int i = 0; i < num.length(); i++) {
//             a[i] = num.charAt(i) - '0';
//         }
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter rotation count:");
//         int r = in.nextInt();
//         r = r % a.length;

//         // Step 2: Create new array for rotated result
//         int[] result = new int[a.length];
//         // Step 3: Apply rotation formula
//         for(int i = 0; i < a.length; i++) {
//             result[i] = a[(i + r) % a.length];

//         }

//         // Step 4: Print rotated digits
//         System.out.print("Rotated Number: ");
//         for(int i = 0; i < result.length; i++) {
//             System.out.print(result[i]);
//         }
//     }
// }
// import java.util.*;

// class prac {
//     public static void main(String[] args) {
//         int n = 4568;
//         // Step 1: Convert number to digit array
//         String num = String.valueOf(n);
//         int[] a = new int[num.length()];
        
//         for(int i = 0; i < num.length(); i++) {
//             a[i] = num.charAt(i) - '0';
//         }
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter rotation count:");
//         int r = in.nextInt();
//         r = r % a.length;   // important optimization
//         // Step 2: Create extra array
//         int[] result = new int[a.length];
//         // Step 3: Apply right rotation formula
//         for(int i = 0; i < a.length; i++) {
//             result[(i + r) % a.length] = a[i];
//         }
//         // Step 4: Print rotated number
//         System.out.print("Rotated Number: ");
//         for(int i = 0; i < result.length; i++) {
//             System.out.print(result[i]);
//         }
//     }
// }

// class ZigZagColumn {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         for (int i = 0; i < arr[0].length; i++) {

//             if (i % 2 == 0) {   // even column → top to bottom
//                 for (int j = 0; j < arr.length; j++) {
//                     System.out.print(arr[i][j] + " ");
//                 }
//             } else {            // odd column → bottom to top
//                 for (int j = arr.length - 1; j >= 0; j--) {
//                     System.out.print(arr[i][j] + " ");
//                 }
//             }
//         }
//     }
// }



// class prac{
//     public static void main(String[] args) {
//        int n=153;
//        int temp=n;
//        int t=n;
//        int digits=0;
//        while(n!=0){
//         int rem=n%10;
//         digits++;
//         n/=10;
//        }
//        int sum=0;
//        while(temp!=0){
//         int rem=temp%10;
//         sum+=Math.pow(rem, digits);
//         temp/=10;
//        }
//        System.out.println(sum);
//        if(t==sum){
//         System.out.println("Armstrong");
//        }
       
//     }
// }
// import java.util.Scanner;
// class prac{
//     public static void main(String[] args) {
//         Scanner in=new  Scanner(System.in);
//         String b1=in.nextLine().toUpperCase();
//         String b2=in.nextLine().toUpperCase();
//         int i=b1.length()-1;
//         int j=b2.length()-1;
//         int carry =0;
//         String digits="0123456789ABCDEF";
//         String result="";
//         while(i>=0||j>=0||carry>0){
//             int sum=carry;
//             if(i>=0){
//                 sum+=digits.indexOf(b1.charAt(i));
//                 i--;
//             }
//             if(j>=0){
//                 sum+=digits.indexOf(b2.charAt(j));
//                 j--;
//             }
//             result=digits.charAt(sum%16)+result;
//             carry=sum/16;
//         }
//         System.out.println("Binary Sum:"+result);


//     }
// }
// import java.util.*;
// class prac{
//     public static void main(String[] args) {
//         Scanner in =new  Scanner(System.in);
//         int n=in.nextInt();
//         for(int i=0;i<=n;i++){
//             int num=1;
//           //  for(int s=1;s<=n-i;s++){
//              //   System.out.print(" ");
//           //  }
//         for(int j=0;j<=i;j++){
//             System.out.print(num+" ");
//             num=num*(i-j)/(j+1);
//         }
//         System.out.println();
//     }
// }
// }

// class stack{
//     int top=-1;
//     char []arr=new char[20];
//     public void push(char c){
//         arr[++top]=c;
//     }
//     public char pop(){
//         return(arr[top--]);
//     }
//     public char peek(){
//         return arr[top];
//     }
//     public boolean isempty(){
//         return top==-1;
//     }
//     public int precendence(char c){
//         if(c=='+'||c=='-'){
//             return 1;
//         }
//         else if(c=='*'||c=='/'){
//             return 2;
//         }
//         else if(c=='^'){
//             return 3;
//         }
//         else{
//             return -1;
//         }
//     }
// }
// class prac{
//     public static void main(String[] args) {
//         stack s=new stack();
//         String infix="a-b/c+(d-a*c+f)";
//         String postfix="";
//         for(int i=0;i<infix.length();i++){
//             char c=infix.charAt(i);
//             if(Character.isLetterOrDigit(c)){
//                 postfix+=c;
//             }
//             else if(c=='('){
//                 s.push(c);
//             }
//             else if(c==')'){
//                 while(!s.isempty()&&s.peek()!='('){
//                     postfix+=s.pop();
//                 }
//                 s.pop();
//             }
//             else{
//                 while(!s.isempty()&&s.precendence(c)<=s.precendence(s.peek())){
//                     postfix+=s.pop();
//                 }
//                 s.push(c);
//             }
//         }
//             while(!s.isempty()){
//                 postfix+=s.pop();
//             }
//         System.out.println("Postfix:"+postfix);

//     }
// }

//doubly linked list
// import java.util.*;
// class Node{
//     int data;
//     Node prev,next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }
// class dll{
//     Node head=null;
//     public void insertatbegg(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//         return;
//         }
//         head.prev=temp;
//         temp.next=head;
//         head=temp;
//     }
//     //insert at end
//     public void insertatend(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//         return;
//         }
//         Node last=head;
//         while(last.next!=null){
//             last=last.next;
//         }
//         last.next=temp;
//         temp.prev=last;
//     }
//     //insert at middle
//     public void insertatmid(int data,int key){
//         Node temp=new Node(data);
//         Node fed=head;
//         while(fed!=null&&fed.data!=key){
//             fed=fed.next;
//         }
//         if(fed==null){
//             System.out.println("key not found");
//             return;
//         }
//         temp.next=fed.next;
//         temp.prev=fed;
//         if(fed.next!=null){
//         fed.next.prev=temp;
//     }
//         fed.next=temp;
        
//     }
//     //delete
//     public void delete(int key){
//         Node temp=head;
//         while(temp!=null&&temp.data!=key){
//             temp=temp.next;
//         }
//         if(temp==null){
//             System.out.println("key not found");
//             return;
//         }
//         if(temp==head){
//             head=head.next;
//             if(head!=null){
//             head.prev=null;
//             }
//             return;
//         }
//         if(temp.next==null){
//             temp.prev.next=null;
//             return;
//         }
//         temp.next.prev=temp.prev;
//         temp.prev.next=temp.next;
//     }
//     //reverse
//     public void reverse(){
//         Node temp=head;
//         Node last=head;
//         if(temp==null){
//             System.out.println("Empty");
//             return;
//         }
//         while(last.next!=null){
//             last=last.next;
//         }
//         while(last!=null){
//             System.out.println(last.data);
//             last=last.prev;
//         }
//     }
//     //display
//     public void display(){
//         Node temp=head;
//         if(head==null){
//             System.out.println("Empty");
//         return;
//         }
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
// }
// class prac{
//     public static void main(String[] args) {
//         dll list=new dll();
//         list.insertatbegg(10);
//         list.insertatbegg(20);
//         list.insertatend(40);
//         list.insertatmid(50, 40);
//         list.delete(80);
//         list.display();
//         System.out.println();
//     }
// }

//sll cll
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class cll{
//     Node head=null;
//     public void display(){
//         Node temp=head;
//         if(temp==null){
//             System.out.println("Empty");
//             return;
//         }
//         do{
//             System.out.println(temp.data);
//             temp=temp.next;
//         }while(temp!=head);
//     }
//     //insertbeg
//     public void insertatbeg(int data){
//         Node temp=new Node(data);
//         if(head==null){
//            head=temp;
//            head.next=head;
//            return;
//         }
//         Node last=head;
//         do{
//             last=last.next;
//         }while(last!=head);
//         temp.next=head;
//         last.next=temp;
//         head=temp;
//     }
//     //insert at end
//     public void insertatend(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//             head.next=head;
//         }
//         Node last=head;
//         while(last.next!=head){
//             last=last.next;
//         }
//         temp.next=head;
//         last.next=temp;
//     }
//     //insert at mid
//     public void insertatmid(int data,int key){
//         Node temp=new Node(data);
//         Node last=head;
//         while(last.next!=head&&last.data!=key){
//             last=last.next;
//         }
//         temp.next=last.next;
//         last.next=temp;
//     }
//     //delete
//     public void delete(int key){
//     if(head == null){
//         System.out.println("Empty list");
//         return;
//     }
//     Node temp = head;
//     Node prev = null;
//     // deleting head node
//     if(head.data == key){
//         Node last = head;

//         while(last.next != head){
//             last = last.next;
//         }
//         // single node case
//         if(head.next == head){
//             head = null;
//             return;
//         }
//         last.next = head.next;
//         head = head.next;
//         return;
//     }
//     // search for node
//     do{
//         prev = temp;
//         temp = temp.next;
//     }while(temp != head && temp.data != key);

//     if(temp.data == key){
//         prev.next = temp.next;
//     }
//     else{
//         System.out.println("Not found");
//     }
// }
// }
// class prac{
//     public static void main(String[] args) {
//         cll list=new cll();
//         list.insertatbeg(30);
//         list.insertatbeg(40);
//         list.insertatend(50);
//         list.insertatmid(60, 40);
//         list.delete(40);
//         list.display();
//     }
// }
import java.util.*;

class MaxOnesRow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = in.nextInt();
        int c = in.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int max = 0;
        int hi = -1; 
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                hi = i;
            }
        }
        System.out.println("Row with maximum 1s: " + hi);
    }
}