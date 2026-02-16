// import java.util.Scanner;
// public class main3001 {
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
        
//         System.out.println("enter n:");
//         int n=in.nextInt();
//         int[] a=new int[n];
//         a[0]=0;
//         a[1]=1;
//         for(int i=2;i<a.length;i++){
//             a[i]=a[i-1]+a[i-2];
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }

    
// }
// public class main3001 {
//     public static void main(String[] args){
//         int l=0;
//         int[] a={3,2,4,-2,4,1,1};
     
//         for(int i=0;i<a.length-1;i++){
//             if(a[i]+a[i+1]==6){
//                 l++;
//             }
//             else if(i < a.length - 2 && a[i] + a[i+1] + a[i+2] == 6){
//                         l++;
//                     }
//         }
//             System.out.println(l);
//         }        
//     }

// public class main3001 {
//     public static void main(String[] args) {

//         int[] a = {3, 2, 4, -2,3, 1, 1};
//         int k = 6; 
//         int sum = 0,len=0,l=0;

//         for (int i = 0; i < a.length; i++) {
//             sum = 0;

//             for (int j = i; j < a.length; j++) {
//                 sum += a[j];

//                 if (sum >=k) {
//                     if(sum==k){
//                         l=j-i+1;
//                     }
//                     break;

//                 }
//             }
//             if(l>len){
//                 len=l;
//             }
//         }

//         System.out.println(len);
//     }
// }

// public class main3001 {
//     public static void main(String[] args) {

//         int[] a = {4,3, 2, 4, -2, 4, 1, 1};
//         int max=a[0];
//         int secmax=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]>max){
//                 secmax=max;
//                 max=a[i];
//             }
//             else if(a[i]>secmax&&a[i]!=max){
//                 secmax=a[i];
//             }

//         }

//         System.out.println(secmax);
//     }
// }


public class main3001 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 1, 2};
        if (a.length == b.length) {
            int n = a.length;
            boolean flag = false;
            for (int i = 0; i < n; i++) {   
                int count = 0;
                for (int j = 0; j < n; j++) {  
                    if (a[(i + j) % n] == b[j]) {
                        count++;
                    } 
                }

                if (count == n) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("rotation");
            else
                System.out.println("not rotation");
        }
        else{
            System.out.println("Not a rotation");
        }
    }
}
