public class min {
    
    public static void main(String[] args) {
    int[][] a={{10,2,4,5},{9,4,2,10}};
    int min=a[0][0];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(a[i][j]<min){
                min=a[i][j];
            }
        }
    }
    System.out.println(min);
}
}
    

