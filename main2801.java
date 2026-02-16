// import java.util.Scanner;
// public class main2801 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter n:");
//         int n =in.nextInt();
//         int num=0,sum=0;
//         for(int i=1; i<=n; i++){
//             num=num*10+9;
//             sum=sum+num;
//         }
//         System.out.println("sum="+sum);
        
//     }
// }

// import java.util.Scanner;
// public class main2801 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter n:");
//         int n =in.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//             }
//             for(int k=1;k<=(2*i)-1;k++){

//                 System.out.print("*");
//             }
// System.out.println();
//         }
//     }
// }


//decimal to hexadecimal printing
// import java.util.Scanner;
// public class main2801 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter n:");
//         int dec =in.nextInt();
//         String hex="  ";
//         while(dec>0){
//             int rem=dec%16;
//             if(rem<10){
//                 hex=hex+rem;
//             }
//             else if(rem>=10){
//                 hex=(char)((rem-10)+'A')+hex;
//             }
//             dec=dec/16;
            
//         }
//         System.out.println(hex);
        
//     }
// }

//decimal to octal
// import java.util.Scanner;
// public class main2801 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter n:");
//         int dec =in.nextInt();
//         String oct="  ";
//         while(dec>0){
//             int rem=dec%8;
//             if(rem<=10){
//                 oct=rem+oct;
                
                
//             }
//             dec=dec/8;
            
//         }
//         System.out.println(oct);
        
//     }
// }

//decimal to binary
// import java.util.Scanner;
// public class main2801 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter n:");
//         int dec =in.nextInt();
//         String bin="  ";
//         while(dec>0){
//             int rem=dec%2;
//             bin=rem+bin;
//             dec=dec/2;
            
//         }
//         System.out.println(bin);
        
//     }
// }

//Binary to Octal
// class main2801{
//     public static void main(String[] args) {
//         String bin="001010111";
//         String oct=" ";
//         int value;
//         while(bin.length()%3!=0){
//             bin="0"+bin;
//         }
//         for(int i=0;i<bin.length();i=i+3){
//             value=0;
//             value+=(bin.charAt(i)-'0')*4;
//             value+=(bin.charAt(i+1)-'0')*2;
//             value+=(bin.charAt(i+2)-'0')*1;
//             oct=oct+value;
//         }
//         System.out.println(oct);
//     }
// } 

//decimal to hexa

// class main2801{
//     public static void main(String[] args) {
//         String bin="11111";
//         String hex=" ";
//         int value;
//         while(bin.length()%4!=0){
//             bin="0"+bin;
//         }
//         for(int i=0;i<bin.length();i=i+4){
//             value=0;
//             value+=(bin.charAt(i)-'0')*8;
//             value+=(bin.charAt(i+1)-'0')*4;
//             value+=(bin.charAt(i+2)-'0')*2;
//             value+=(bin.charAt(i+3)-'0')*1;
//             if(value>10){

//                 int rem=value%16;

//                 hex+=(char)((rem-10)+'A');
                
//             }else{
//                 hex+=value;
//             }
//         }
//         System.out.println(hex);
//     }
// } 


//hexa to binary

// class main2801{
//     public static void main(String[] args) {
//         String hex="76";
//         String bin=" ";
//         int value;
//         for(int i=0;i<hex.length();i++){
//             value=0;
//             if(hex.charAt(i)>='0' && hex.charAt(i)<='9'){
//                 value=hex.charAt(i)-'0';
//             }else if(hex.charAt(i)>='A' && hex.charAt(i)<='F'){
//                 value=hex.charAt(i)-'A'+10;
//             }
//             for(int j=3;j>=0;j--){
//                 int k=value>>j & 1;
//                 bin=bin+k;
//             }
//         }
//        System.out.println(bin);
//     }
// } 

//hexadecimal to octal
// class main2801 {
//     public static void main(String[] args) {
//         String hex = "76";
//         String bin = "";
//         int value;

//         for (int i = 0; i < hex.length(); i++) {
//             value = 0;
//             if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
//                 value = hex.charAt(i) - '0';
//             } else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
//                 value = hex.charAt(i) - 'A' + 10;
//             }

//             for (int j = 3; j >= 0; j--) {
//                 int k = (value >> j) & 1;   
//                 bin = bin + k;
//             }
//         }

//         System.out.println(bin);

//         String oct = "";
//         int value1;

//         while (bin.length() % 3 != 0) {
//             bin = "0" + bin;
//         }

//         System.out.println(bin);

//         for (int i = 0; i < bin.length(); i = i + 3) {
//             value1 = 0;
//             value1 += (bin.charAt(i) - '0') * 4;
//             value1 += (bin.charAt(i + 1) - '0') * 2;
//             value1 += (bin.charAt(i + 2) - '0') * 1;
//             oct = oct + value1;
//         }

//         System.out.println(oct);
//     }
// }


//binary addition
// class main2801 {
//     public static void main(String[] args) {
//         String b1 = "11010";
//         String b2 = "01100";

//         while (b1.length() != b2.length()) {
//             if (b1.length() > b2.length()) {
//                 b2 = '0' + b2;
//             } else {
//                 b1 = '0' + b1;
//             }
//         }

//         int n1 = Integer.parseInt(b1, 2);
//         int n2 = Integer.parseInt(b2, 2);
//         int sum = n1 + n2;

//         System.out.println(Integer.toBinaryString(sum));
//     }
// }

// binary addition 
// class main2801 {
//     public static void main(String[] args) {

//         String b1 = "100";
//         String b2 = "0011";

//         while (b1.length() != b2.length()) {
//             if (b1.length() > b2.length()) {
//                 b2 = '0' + b2;
//             } else {
//                 b1 = '0' + b1;
//             }
//         }

//         int carry = 0;
//         String result = "";

//         for (int i = b1.length() - 1; i >= 0; i--) {

//             int bit1 = b1.charAt(i) - '0';
//             int bit2 = b2.charAt(i) - '0';

//             int sum = bit1 + bit2 + carry;

//             result = (sum % 2) + result;
//             carry = sum / 2;             
//         }

       
//         if (carry == 1) {
//             result = '1' + result;
//         }

//         System.out.println("Binary Sum = " + result);
//     }
// }


//octal addition
// class main2801 {
//     public static void main(String[] args) {

//         String b1 = "55";
//         String b2 = "66";

//         while (b1.length() != b2.length()) {
//             if (b1.length() > b2.length()) {
//                 b2 = '0' + b2;
//             } else {
//                 b1 = '0' + b1;
//             }
//         }

//         int carry = 0;
//         String result = "";

        
//         for (int i = b1.length() - 1; i >= 0; i--) {

//             int bit1 = b1.charAt(i) - '0';
//             int bit2 = b2.charAt(i) - '0';

//             int sum = bit1 + bit2 + carry;

//             result = (sum % 8) + result; 
//             carry = sum / 8;             
//         }

//         if (carry == 1) {
//             result = '1' + result;
//         }

//         System.out.println("octal Sum = " + result);
//     }
// }

//hexa addition

class main2801 {
    public static void main(String[] args) {

        String b1 = "AE4";
        String b2 = "B26";

        while (b1.length() != b2.length()) {
            if (b1.length() > b2.length()) {
                b2 = '0' + b2;
            } else {
                b1 = '0' + b1;
            }
        }

        int carry = 0;
        String result = "";

        for (int i = b1.length() - 1; i >= 0; i--) {

            int d1 = hexToDec(b1.charAt(i));
            int d2 = hexToDec(b2.charAt(i));

            int sum = d1 + d2 + carry;
            int rem = sum % 16;
            carry = sum / 16;

            result = decToHex(rem) + result;
        }

        if (carry > 0) {
            result = decToHex(carry) + result;
        }

        System.out.println("Hexa Sum = " + result);
    }

    static int hexToDec(char ch) {
        if (ch >= '0' && ch <= '9')
            return ch - '0';
        else
            return ch - 'A' + 10;
    }

    static char decToHex(int n) {
        if (n < 10)
            return (char)(n + '0');
        else
            return (char)(n - 10 + 'A');
    }
}
