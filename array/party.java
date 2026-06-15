import java.util.Scanner;
public class party {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter T:");
        int T=in.nextInt();
        // System.out.println("enter entry per hour:");
        // int []E=new int[T];
        // System.out.println("Enter Left per hour:");
        // int []L=new int[T];
        int []E={7,0,5,1,3};
        int []L={1,2,1,3,4};
        int AP=0;int PH=0;int count=0;
        for(int i=0;i<T;i++){
            E[i]+=AP;
            PH=E[i]-L[i];
            AP=PH;
            if(PH>count){
                count=PH;
            }
        }
        System.out.println(count);
    }
    
}
