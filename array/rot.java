public class rot {

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for(int i = 0; i < a.length; i++) {
            leftRotation(a[i], i);  
        }

        System.out.println("After Rotation:");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leftRotation(int[] row, int k) {

        int n = row.length;
        

        int[] temp = new int[k];
        

        for(int i = 0; i < k; i++) {
            temp[i] = row[i];
        }

        for(int i = k; i < n; i++) {
            row[i - k] = row[i];
        }

        for(int i = 0; i < k; i++) {
            row[n - k + i] = temp[i];
        }
    }
}

