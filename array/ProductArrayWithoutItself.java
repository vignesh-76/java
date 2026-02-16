// public class ProductArrayWithoutItself {
//     public static void main(String[] args) {

//         int[] a = {1, 2, 3, 4};

//         for (int i = 0; i < a.length; i++) {
//             int product = 1;  

//             for (int j = 0; j < a.length; j++) {
//                 if (i != j) {
//                     product *= a[j];
//                 }
//             }

//             System.out.print(product + " ");
//         }
//     }
// }


//single loop
public class ProductArrayWithoutItself {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int n = a.length;

        int[] result = new int[n];

        int left = 1;
        int right = 1;

        for (int i = 0; i < n; i++) {
            result[i] = left;          
            left *= a[i];

            result[n - 1 - i] *= right; 
            right *= a[n - 1 - i];
        }
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
