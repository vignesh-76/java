public class max {
    public static void main(String[] args) {
    int[][] a={{1,2,4,5},{9,4,2,10}};
    int max=a[0][0];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(a[i][j]>max){
                max=a[i][j];
            }
        }
    }
    System.out.println(max);
    
}
}
