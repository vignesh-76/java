// import java.util.Scanner;
// public class main2901 {
//     public static void main(String[] args){
//         int[] a=new int[5];
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter elements:");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             a[i]=in.nextInt();
//         }
//         System.out.println("Array elements:");
//         for(int i=0;i<n;i++){
//             System.out.println(a[i]);
//         }
//     }
    
// }
// public class main2901 {
//     public static void main(String[] args){
//         int[] a={10,3,4,5,-9,-5};
//         int min=a[0];
//         for(int i=1;i<a.length;i++){
//             if(a[i]<min){
//                 min=a[i];
//             }
//         }
//         System.out.println("Minimum ="+min);
        
//     }
    
// }

//maximum
// public class main2901 {
//     public static void main(String[] args){
//         int[] a={10,3,4,5,-9,-5};
//         int max=a[0];
//         for(int i=1;i<a.length;i++){
//             if(a[i]>max){
//                 max=a[i];
//             }
//         }
//         System.out.println("Maximum ="+max);
        
//     }
    
// }

//second maximum
// public class main2901 {
//     public static void main(String[] args){
//         int[] a={10,20,35,40,36,5};
//         int max=a[0];
//         int secmax=a[0];
//         for(int i=1;i<a.length;i++){
//             if(a[i]>max){
                
//                 secmax=max;
//                 max=a[i]; 
//             }
//             else if(a[i]>secmax&&a[i]!=max)
//             {
//                 secmax=a[i];
//             }

//         }
//         System.out.println("Maximum ="+max);
//          System.out.println("Maximum ="+secmax);
        
//     }
    
// }


//second minimum
// public class main2901 {
//     public static void main(String[] args){
//         int[] a={10,20,35,40,36,5};
//         int min=a[0];
//         int secmin=a[0];
//         for(int i=1;i<a.length;i++){
//             if(a[i]<min){
                
//                 secmin=min;
//                 min=a[i]; 
//             }
//             else if(a[i]<secmin&&a[i]!=min)
//             {
//                 secmin=a[i];
//             }

//         }
//         System.out.println("Minimum ="+min);
//         System.out.println("Second Minimum="+secmin);
        
//     }
    
// }

//Ascending  order

// public class main2901 {
//     public static void main(String[] args){
//         int[] a={4,6,5,1,7};
//         for(int i=0;i<a.length;i++){
//             for(int j=i+1;j<a.length;j++)
//             if(a[i]>a[j]){
//                 int temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//             }
            
//         }
//             for(int i=0;i<a.length;i++)
//             {
//             System.out.println(a[i]);
//             }
//         }
//     }
    
//descending order
// public class main2901 {
//     public static void main(String[] args){
//         int[] a={4,6,5,1,7};
//         for(int i=0;i<a.length-1;i++){
//             for(int j=i+1;j<a.length;j++)
//             if(a[i]<a[j]){
//                 int temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//             }
            
//         }
//             for(int i=0;i<a.length;i++)
//             {
//             System.out.println(a[i]);
//             }
//         }
//     }

// reverse the array

//     public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {1, 3, 6, 1, 2};

//         int i = 0;
//         int j = a.length - 1;

//         while (i < j) {
//             int temp = a[i];
//             a[i] = a[j];
//             a[j] = temp;
//             i++;
//             j--;
//         }

//         for (int k = 0; k < a.length; k++) {
//             System.out.println(a[k]);
//         }
//     }
// }

// count even and odd in array
// public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {5, 3, 6, 1, 2};
//         int odd=0;
//         int even=0;

//         for(int i=0;i<a.length;i++){
//             if(i%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//         }
//         System.out.println(odd);
//         System.out.println(even);
//     }
// }

//search

//  public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {5, 3, 6, 1, 2};
//         boolean is=true;
//         int t=2;
//         for(int i=0;i<a.length;i++){
//             if(a[i]==t){
//                 is=true;
//             }
//         }
//         if(is){
//             System.out.println("found");
//         }
//         else{
//             System.out.println("Not found");
//         }
//         }
//     }



// //duplicate elements


// public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {5, 3, 3, 6, 3, 6, 6, 1, 2, 2};

//         for (int i = 0; i < a.length; i++) {
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[i] == a[j]) {
//                     System.out.println(a[i]);
//                     break;   
//                 }
//             }
//         }
//     }
// }

// public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {5, 3, 3, 6, 3, 6, 6, 1, 2, 2};
//         int count = 0;

//         for (int i = 0; i < a.length; i++) {

//             boolean already = false;
//             for (int k = 0; k < i; k++) {
//                 if (a[i] == a[k]) {
//                     already = true;
//                     break;
//                 }
//             }
//             if (already) continue;

//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[i] == a[j]) {
//                     count++;
//                     break;
//                 }
//             }
//         }

//         System.out.println(count);
//     }
// }





// no of unique values in array
// public class main2901 {
//     public static void main(String[] args) {
//         int[] a = {5, 3, 3, 6, 3, 6, 6, 1, 2,8};
//         int uniqueCount = 0;

//         for (int i = 0; i < a.length; i++) {
//             int count = 0;

//             for (int j =0; j < a.length; j++) {
//                 if (a[i] == a[j]) {
//                     count++;
                
//                 }
//             }

//             if (count == 1) {
                
//                 uniqueCount++;
//             }
//         }

//         System.out.println(uniqueCount);
//     }
// }



//merge two array
public class main2901 {
    public static void main(String[] args) {
        int[] a = {5, 3, 3, 6};
        int[] b={1,3,5,3};
        int d=0;
        int[]c=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[d++]=a[i];
    }
        for(int i=0;i<b.length;i++){
            c[d++]=b[i];
    }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
            
    }
}
}







