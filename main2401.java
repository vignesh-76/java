// import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         System.err.println("Enter the no of the day:");
//         n=in.nextInt();
//         switch(n)
//         {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Thursaday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }

//     }
    
// }


// import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         char n;
//         System.out.println("Enter special char:");
//         n=in.nextLine().charAt(0);
//         switch(n)
//         {
//             case '$':
//                 System.out.println("asalt");
//                 break;
//             case '*':
//                 System.out.println("gustam");
//                 break;
//             case '@':
//                 System.out.println("deaf");
//                 break;
            
//             default:
//                 System.out.println("GBU");
//         }

//     }
// }


// import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n,i=1;
//         System.out.println("Enter n:");
//         n=in.nextInt();
//         for(;i<=16;i++){
            
//                 System.out.println(i+"*"+n+"="+(i*n));

//         }

//     }
//}
//sum of digits
// import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         int sum=0;
//         System.out.println("Enter n:");
//         n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             sum+=i;
                
//         }
//         System.out.println(sum);

//     }
// }




//no og digits

// import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         int count=0;
//         System.out.println("Enter n:"); 
//         n=in.nextInt();
//         while(n!=0){
//             n=n/10;
//             count++;
//         }
//         System.out.println(count);

//     }

// }


//sum of digits

//  import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         int sum=0;
//         System.out.println("Enter n:"); 
//         n=in.nextInt();
//         while(n!=0){
//             int digits=n%10;
//             sum+=digits;
//             n=n/10;
//         }
//         System.out.println(sum);

//     }

// }


//armstrong number wrong

//  import java.util.Scanner;
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         System.out.println("Enter n:"); 
//         int sum=0;
//         n=in.nextInt();
//         int o=n;
//         int count=0;


//         while(n!=0){
//             n=n/10;
//             count++;
        
//         }
//         System.out.println();
        
//         n=o;

//         int rem=o%10;

//         System.out.println(rem);
//         sum +=Math.pow(count, rem);
//         System.out.println(sum);
//         if(sum==o){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("Not Armstrong number");
    
        
            
//         }

//     }
// }

//armstrong number right

// import java.util.Scanner;              
// public class main2401 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n;
//         System.out.println("Enter n:"); 
//         int sum=0;
//         n=in.nextInt();
//         int o=n;
//         int count=0;
//         while(n!=0){
//             n=n/10;
//             count++;
        
//         }
//         n=o;
//         while(n!=0){        
//             int rem=n%10;
//             sum +=Math.pow(rem, count);
//             n=n/10;
//         }
//         if(sum==o){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("Not Armstrong number");
    
        
            
//         }
//     }
// }



//factorial
    // import java.util.Scanner;              
    // public class main2401 {
    //     public static void main(String[] args){
    //         Scanner in=new Scanner(System.in);
    //         int n;
    //         System.out.println("Enter n:"); 
    //         int fact=1;
    //         n=in.nextInt();
    //         if(n<0){
    //             System.out.println("invalid fact");
    //         }

    //         else if(n==0||n==1){
    //             System.out.println("FAct is 1");
    //         }
    //         else{
    //             for(int i=1;i<=n;i++){
    //                 fact=fact*i;
    //             }
    //             System.out.println(fact);
    //         }   
    //     }
    // }



 //fibonnic series


//   import java.util.Scanner;
//   public class main2401 {
//         public static void main(String[] args){
//             Scanner in=new Scanner(System.in);
//             int n;
//             int a=0,b=1;
//             System.out.println("Enter n:"); 
//             n=in.nextInt();
//             for(int i=0;i<=n;i++){
//                 System.out.println(a);
//                 int c=a+b;
//                 a=b;
//                 b=c;
//             }
//         }
//     }

//   import java.util.Scanner;
//   public class main2401 {
//         public static void main(String[] args){
//             Scanner in=new Scanner(System.in);
//             int n;
//             System.out.println("Enter num:"); 
//             n=in.nextInt();
//             for(int i=2;i<=n/2;i++){
//                 if(n%i==0){
//                     System.out.println("not prime");
//                     break;
//                 }
//                 else{

                
//                 System.out.println("prime");
//                 break;
//                 }
                
            
//             }
//         }
//     }




//prime number from 1 to 1000
 
//     public class main2401 {
//     public static void main(String[] args) {

//         for (int n = 2; n <= 1000; n++) {
//             boolean isPrime = true;

//             for (int i = 2; i <= n / 2; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) {
//                 System.out.println(n + " is prime");
//             }
//         }
//     }
// }


// class main2401{
//     public static void main(String[] args){
//         for (int i=0;i<10;i++){
//             if(i==5)
//                 break;
//             else
//                 System.out.println(i);
//         }

//     }
// }



// class main2401{
//     public static void main(String[] args){
//         for (int i=0;i<10;i++){
//             if(i==5)
//                 continue;
//             else
//                 System.out.println(i);
//         }

//     }
// }



// class main2401{
//     public static void main(String[] args){
//         for (int i=0;i<10;i++){
//             if(i==5)
//                 return;
//             else
//                 System.out.println(i);
//         }

//     }
// }



// import java.util.Scanner;
// class main2401{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n=in.nextInt();
//         int i=2;
//         do { 
//             System.out.println(i);
//             i=i+2;
            
//         } while (i<=n);
         
//     }
// }



//reverse number

//  import java.util.Scanner;
//  class main2401{
//      public static void main(String[] args) {
//          Scanner in=new Scanner(System.in);
//          System.out.print("Enter n:");
//          int i=in.nextInt();
//         String length=String.valueOf(i);
//         for(int j=1;j<=length.length();j++){
//             System.out.print(i%10);
//             i/=10;
//         }}
//  }
 


// palindrome number

//  import java.util.Scanner;
//  class main2401{
//      public static void main(String[] args) {
//          Scanner in=new Scanner(System.in);
//          System.out.print("Enter n:");
//          int n=in.nextInt();
//          int o=n;
//          int rev=0;
//          while(n!=0){
//              int rem=n%10;
//              rev=rev*10+rem;
//              n=n/10;
//          }
//          if(o==rev){
//              System.out.println("palindrome");
//          }
//          else{
//              System.out.println("not palindrome");
//          }
//      }
//  }


// armstrong number
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int o=n;
    //         int sum=0;
    //         int count=0;
    //         while(n!=0){
    //             n=n/10;
    //             count++;
            
    //         }
    //         n=o;
    //         while(n!=0){        
    //             int rem=n%10;
    //             sum +=Math.pow(rem, count);
    //             n=n/10;
    //         }
    //         if(sum==o){
    //             System.out.println("Armstrong number");
    //         }
    //         else{
    //             System.out.println("Not Armstrong number");
        
            
                
    //         }
    //     }
    // }

    // gcd of two numbers
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n1:");
    //         int n1=in.nextInt();
    //         System.out.print("Enter n2:");
    //         int n2=in.nextInt();
    //         int gcd=1;
    //         for(int i=1;i<=n1 && i<=n2;i++){
    //             if(n1%i==0 && n2%i==0){
    //                 gcd=i;
    //             }
    //         }
    //         System.out.println("GCD is "+gcd);
    //     }
    // }

// lcm of two numbers
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n1:");
    //         int n1=in.nextInt();
    //         System.out.print("Enter n2:");
    //         int n2=in.nextInt();
    //         int gcd=1;
    //         for(int i=1;i<=n1 && i<=n2;i++){
    //             if(n1%i==0 && n2%i==0){
    //                 gcd=i;
    //             }
    //         }
    //         int lcm=(n1*n2)/gcd;
    //         System.out.println("LCM is "+lcm);
    //     }
    // }

    // check if a number is perfect number
    // import java.util.Scanner;
    // class main2401{ 
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int sum=0;
    //         for(int i=1;i<n;i++){
    //             if(n%i==0){
    //                 sum+=i;
    //             }
    //         }
    //         if(sum==n){
    //             System.out.println("Perfect number");
    //         }
    //         else{
    //             System.out.println("Not perfect number");
    //         }
    //     }
    // }

    // fibonacci series upto 10 terms
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         int n=10;
    //         int a=0,b=1;
    //         for(int i=1;i<=n;i++){
    //             System.out.println(a);
    //             int c=a+b;
    //             a=b;
    //             b=c;
    //         }
    //     }
    // }

    // check if a number is strong number
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int o=n;
    //         int sum=0;
    //         while(n!=0){
    //             int rem=n%10;
    //             int fact=1;
    //             for(int i=1;i<=rem;i++){
    //                 fact=fact*i;
    //             }
    //             sum+=fact;
    //             n=n/10;
    //         }
    //         if(sum==o){
    //             System.out.println("Strong number");
    //         }
    //         else{
    //             System.out.println("Not strong number");
    //         }
    //     }
    // }

    // check if a number is automorphic number
    // import java.util.Scanner;
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int o=n;
    //         int sq=n*n;
    //         boolean flag=false;
    //         while(n!=0){
    //             if(n%10 != sq%10){
    //                 flag=true;
    //                 break;
    //             }
    //             n=n/10;
    //             sq=sq/10;
    //         }
    //         if(flag){
    //             System.out.println("Not automorphic number");
    //         }
    //         else{
    //             System.out.println("Automorphic number");
    //         }
    //     }
    // }

    // check if a number is harshad number
    // import java.util.Scanner;   
    // class main2401{
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int o=n;
    //         int sum=0;
    //         while(n!=0){
    //             int rem=n%10;
    //             sum+=rem;
    //             n=n/10;
    //         }
    //         if(o%sum==0){
    //             System.out.println("Harshad number");
    //         }
    //         else{
    //             System.out.println("Not Harshad number");
    //         }
    //     }
    // }

    //generate prime numbers upto n
    // import java.util.Scanner;
    // class main2401{ 
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         for (int num = 2; num <= n; num++) {
    //             boolean isPrime = true;
    
    //             for (int i = 2; i <= num / 2; i++) {
    //                 if (num % i == 0) {
    //                     isPrime = false;
    //                     break;
    //                 }
    //             }
    
    //             if (isPrime) {
    //                 System.out.println(num + " is prime");
    //             }
    //         }
    //     }
    // }


    //check if a number is number is neon number
    // import java.util.Scanner;
    // class main2401{ 
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int sq=n*n;
    //         int sum=0;
    //         while(sq!=0){
    //             int rem=sq%10;
    //             sum+=rem;
    //             sq=sq/10;
    //         }
    //         if(sum==n){
    //             System.out.println("Neon number");
    //         }
    //         else{
    //             System.out.println("Not Neon number");
    //         }
    //     }
    // }

    //find the sum of first n natural numbers 
    // import java.util.Scanner;
    // class main2401{ 
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         int sum=0;
    //         for(int i=1;i<=n;i++){
    //             sum+=i;
    //         }
    //         System.out.println("Sum is "+sum);
    //     }
    // }


    //covert decimal to binary'
    // import java.util.Scanner;
    // class main2401{ 
    //     public static void main(String[] args) {
    //         Scanner in=new Scanner(System.in);
    //         System.out.print("Enter n:");
    //         int n=in.nextInt();
    //         String binary="";
    //         while(n!=0){
    //             int rem=n%2;
    //             binary=rem+binary;
    //             n=n/2;
    //         }
    //         System.out.println("Binary is "+binary);
    //     }
    // }

    //find the largest digit in a number
    import java.util.Scanner;
    class main2401{ 
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter n:");
            int n=in.nextInt();
            int max=0;
            while(n!=0){
                int rem=n%10;
                if(rem>max){
                    max=rem;
                }
                n=n/10;
            }
            System.out.println("Largest digit is "+max);
        }
    }