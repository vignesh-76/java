import java.util.Scanner;
public class fibonacci {
  
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter n:");
        int n=in.nextInt();
        int[] a=new int[n];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
    

