// import java.util.Scanner;

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



import java.util.Scanner;

class prac {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter decimal number 1:");
        int d1 = in.nextInt();

        System.out.println("Enter decimal number 2:");
        int d2 = in.nextInt();

        String h1 = toHex(d1);
        String h2 = toHex(d2);

        String hexSum = addHex(h1, h2);

        int finalDecimal = Integer.parseInt(hexSum, 16);

        System.out.println("Hex 1: " + h1);
        System.out.println("Hex 2: " + h2);
        System.out.println("Hex Addition Result: " + hexSum);
        System.out.println("Final Answer in Decimal: " + finalDecimal);
    }

    public static String toHex(int num) {
        StringBuilder hex = new StringBuilder();

        while (num > 0) {
            int rem = num % 16;
            if (rem < 10)
                hex.append((char)(rem + '0'));
            else
                hex.append((char)(rem - 10 + 'A'));

            num = num / 16;
        }

        return hex.reverse().toString();
    }

    public static String addHex(String h1, String h2) {

        StringBuilder result = new StringBuilder();

        int i = h1.length() - 1;
        int j = h2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int val1 = 0;
            int val2 = 0;

            if (i >= 0) {
                char c1 = h1.charAt(i);
                if (c1 >= '0' && c1 <= '9')
                    val1 = c1 - '0';
                else
                    val1 = c1 - 'A' + 10;
                i--;
            }

            if (j >= 0) {
                char c2 = h2.charAt(j);
                if (c2 >= '0' && c2 <= '9')
                    val2 = c2 - '0';
                else
                    val2 = c2 - 'A' + 10;
                j--;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 16;
            int digit = sum % 16;

            if (digit < 10)
                result.append((char)(digit + '0'));
            else
                result.append((char)(digit - 10 + 'A'));
        }

        return result.reverse().toString();
    }
}








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

