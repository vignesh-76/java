import java.util.*;
class parking{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int R=in.nextInt();
        int C=in.nextInt();
        int [][]a=new int[R][C];
        int rowindex=0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         a[i][j]=in.nextInt();
        //     }
        // }
        int max=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
                if(a[i][j]!=0&&a[i][j]!=1){
                    System.out.println("Invalid input");
                    return;
                }
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                rowindex=i+1;
            }
        }
        System.out.println(rowindex);

    }
}