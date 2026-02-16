import java.util.Scanner;
public class inputarraay {
    public static void main(String[] args){
        int[] a=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("enter elements:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    
}
}
