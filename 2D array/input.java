import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter elements:");
        int[][] a=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
            a[i][j]=in.nextInt();
        }
    }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
        System.out.println("Array elements:"+a[i][j]);
        }
    }
    
    
}}


