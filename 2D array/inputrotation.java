import java.util.Scanner;
public class inputrotation {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{4,3,1,2}, {5,6,7,8},{7,6,3,1}};
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the row index to rotate:");
        int r=in.nextInt();

        System.out.println("enter the no of rotation:");
        int n=in.nextInt();

        n = n % a[r].length;   

        for(int i=0;i<a.length;i++){
            if(i==r){
                for(int k=0;k<n;k++){         
                    int temp = a[r][0];        
                    for(int j=0;j<a[r].length-1;j++){
                        a[r][j] = a[r][j+1];  
                    }
                    a[r][a[r].length-1] = temp;
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

