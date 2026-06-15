public class bordersum {
    public static void main(String[] args) {
        int [][]a={{2,2,2,2},
                   {2,2,3,2},
                   {2,4,5,2},
                   {2,2,2,2}};
                   
        int sum=0;
        int n=a.length;
        int m=a[0].length;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Border Sum = " + sum);
    }
}

