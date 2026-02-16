// public class interchange1withlast {
//     public static void main(String[] args) {
//         int[][] a = { {1,2,3,4}, {5,6,7,8},{51,61,71,81}, {11,12,13,14}};

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[0].length; j++) {

//                 if (i == 0) {
//                     int temp = a[i][j];
//                     a[i][j] = a[a.length - 1][j];
//                     a[a.length - 1][j] = temp;
//                 }

//             }
//         }

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[0].length; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }





public class interchange1withlast {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8}, {51,61,71,81},{11,12,13,14}};
        for (int j = 0; j < a[0].length; j++) {
            int temp = a[0][j];
            a[0][j] = a[a.length - 1][j];
            a[a.length - 1][j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
