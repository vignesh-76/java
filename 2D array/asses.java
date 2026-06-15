import java.util.Scanner;
public class asses {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}, {7,8,9}};
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the row index to rotate:");
        int r=in.nextInt();

        System.out.println("enter the no of rotation:");
        int n=in.nextInt();

        int m=a[r].length;
        for(int i=0;i<a.length;i++){
            if(i==r){
                for(int j=0;j<n;j++){
                    int temp=a[i][0];
                    for(int k=0;k<m-1;k++){
                        a[i][k]=a[i][k+1];
                    }
                    a[i][m-1]=temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

