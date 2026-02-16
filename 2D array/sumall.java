public class sumall {
    public static void main(String[] args) {
        int[][] a = {{1,1},{1,1},{1,1}};   
        int[][] b = {{1,1,1},{1,1,2}}; 
        int c=0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                    c += a[i][j];
                }
            }
        for(int k = 0; k < b.length; k++) {
            for(int j = 0; j < b[k].length; j++) {
            c += b[k][j];
            }
        }
         System.out.println(c);
    }
    
}

