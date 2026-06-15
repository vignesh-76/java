import java.util.Scanner;

public class spiralrotate {

    public static void main(String[] args) {

        int [][] a={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rotations:");
        int k = sc.nextInt();

        int n = a.length;
        int m = a[0].length;

        while(k-- > 0){

            int top=0, bottom=n-1;
            int left=0, right=m-1;

            while(top < bottom && left < right){

                int temp = a[top][left];
                for(int i=top;i<bottom;i++)
                    a[i][left] = a[i+1][left];

                for(int i=left;i<right;i++)
                    a[bottom][i] = a[bottom][i+1];

                for(int i=bottom;i>top;i--)
                    a[i][right] = a[i-1][right];

                for(int i=right;i>left+1;i--)
                    a[top][i] = a[top][i-1];

                a[top][left+1] = temp;

                top++; bottom--;
                left++; right--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
