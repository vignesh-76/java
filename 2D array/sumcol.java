public class sumcol {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2},{1,2}};

        for(int i = 0; i < a[0].length; i++) {  
            int r = 0;
            for(int j = 0; j < a.length; j++) { 
                r += a[j][i];
            }
            System.out.println("column " + r);
        }
    }
}
