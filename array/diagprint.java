class diagprint {
    public static void main(String[] args) {

        int [][] a = {
            {2,4,6,4},
            {8,10,12,4},
            {14,16,18,2}
        };

        int rows = a.length;
        int cols = a[0].length;

        // First row diagonals
        for(int k = 0; k < cols; k++){
            int i = 0;
            int j = k;
            boolean even = true;

            while(i < rows && j >= 0){
                if(a[i][j] % 2 != 0){
                    even = false;
                }
                i++;
                j--;
            }

            if(even){
                i = 0;
                j = k;
                while(i < rows && j >= 0){
                    System.out.print(a[i][j]);
                    i++;
                    j--;
                }
                System.out.println();
            }
        }

        // Last column diagonals (excluding first row)
        for(int k = 1; k < rows; k++){
            int i = k;
            int j = cols - 1;
            boolean even = true;

            while(i < rows && j >= 0){
                if(a[i][j] % 2 != 0){
                    even = false;
                }
                i++;
                j--;
            }

            if(even){
                i = k;
                j = cols - 1;
                while(i < rows && j >= 0){
                    System.out.print(a[i][j]);
                    i++;
                    j--;
                }
                System.out.println();
            }
        }
    }
}
