// import java.util.Scanner;

// public class jar {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=10;
//         int k=5;
//         System.out.println("Enter the candies sold:");
//         int s=in.nextInt();
//         int r=n-s;
//         if(r<0||r<k){
//             System.out.println("INVALID INPUT");
//             return;
//         }
//         if(r==k){
//             r=n;
//         }
//         System.out.println("NUMBER of CANDIES SOLD:"+s);
//         System.out.println("NUMBER OF CANDIES LEFT :"+r);
//     }
// }
import java.util.Scanner;

public class jar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 10;
        int K = 5;
        int jar = N;
        while(true){
        int order = in.nextInt();
        if(order <= 0 || order > (jar - K)){
            System.out.println("INVALID INPUT");
            return;
        }
        jar = jar - order;
        System.out.println("Number of Candies sold: " + order);
        if(jar == K){
            jar = N;
        }
        System.out.println("Number of Candies available: " + jar);
    }
}
}