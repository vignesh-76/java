class diagprint{
    public static void main(String[] args) {
        int [][] a={{2,3,4},{2,4,2},{4,8,9}};
        int n=a.length;
        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(j>=0){
                System.out.print(a[i][j]);
                i++;
                j--;
            }
            System.out.println();
        }
        for(int k=1;k<n;k++){
            int i=k;
            int j=n-1;
            while(i<n){
                System.out.print(a[i][j]);
                i++;
                j--;
            }
            System.out.println();
        }
        
    }
}