// import java.util.Scanner;
// public class baloon {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int r=0,g=0,y=0,b=0;
//         String []a={"r","g","b","b","g","y","y",};
//         for(int i=0;i<a.length;i++){
//             switch(a[i]){
//                 case "r":r++;break;
//                 case "g":g++;break;
//                 case "y":y++;break;
//                 case "b":b++;break;
//                 default:System.out.println("invalid");
//                 return;
//             }
//         }
//         if(r%2!=0){System.out.println("r");return;}
//         if(g%2!=0){System.out.println("g");return;}
//         if(b%2!=0){System.out.println("b");return;}
//         if(y%2!=0){System.out.println("y");return;}
//         System.out.println("All are even");
//     }   
// }
import java.util.*;

class balloon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char[] B = new char[N];
        for(int i = 0; i < N; i++){
            B[i] = in.next().charAt(0);
        }
        boolean found = false;
        for(int i = 0; i < N; i++){
            int count = 0;

            for(int j = 0; j < N; j++){
                if(B[i] == B[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                System.out.println(B[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("All are even");
        }
    }
}