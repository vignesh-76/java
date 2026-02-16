import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] c=new int[a.length][b.length];
        System.out.println("enter elements of a:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
            a[i][j]=in.nextInt();
        }
        }
        System.out.println("enter elements of b:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
            b[i][j]=in.nextInt();
        }
    }
    for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=a[i][j]+b[i][j];   
    }       
}
System.out.println("elements of C:");
    for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                
                System.out.println(c[i][j]);
            }
        }
    }
}
    

