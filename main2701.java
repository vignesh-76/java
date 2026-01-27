// import java.util.Scanner;
// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//              System.out.print(j+" ");
                
//             }


//         System.out.println(" ");
//     }
    
// }}


// import java.util.Scanner;
// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n=in.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 sum+=1;
//              System.out.print(sum+" ");
                
//             }
//         System.out.println(" ");
//     }
    
// }}



// import java.util.Scanner;
// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n=in.nextInt();
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
                
//              System.out.print("*");
                
//             }
//         System.out.println(" ");
//     }
    
// }}



// import java.util.Scanner;
// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n=in.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             int num=0;
//             for(int j=1;j<=i;j++){
//                 num=num*10;
//                 num=num+9;
                
//             }
//             sum=sum+num;
//         }
//         System.out.println(sum );
//     }
    
// }



// import java.util.Scanner;
// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n=in.nextInt();
        
//         for(int i = 1;i<= n; i++){
//             for(int j = 1; j <= n-i; j++)
// {
//              System.out.print(" ");
//             }
//             for(int k = 1;k <= (2*i)-1; k++){
//             System.out.print("*");
//             }
//         System.out.println();
//     }
    
// }}


// import java.util.Scanner;

// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n = in.nextInt();

//         for(int i = 1; i <= n; i++) {

//             for(int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }

//             for(int k = 1; k <= 2 * (n - i) + 1; k++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n = in.nextInt();

        
//         for(int i = 1; i <= n; i++) {

//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for(int k = 1; k <= (2 * i) - 1; k++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//         for(int l = 1; l <= n - 1; l++) {

//             for(int m = 1; m <= l; m++) {
//                 System.out.print(" ");
//             }

//             for(int o = 1; o <= 2 * (n - l) - 1; o++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class main2701 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = in.nextInt();

       
//         for(int i = 1; i <= n; i++) {

//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }

//             for(int l = i - 1; l >= 1; l--) {
//                 System.out.print(l);
//             }

//             System.out.println();
//         }

     
//         for(int i = n - 1; i >= 1; i--) {

//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }

//             for(int l = i - 1; l >= 1; l--) {
//                 System.out.print(l);
//             }

//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;
class main2701{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int s=i-1;s>=1;s--){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
