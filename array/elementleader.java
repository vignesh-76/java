
// public class elementleader{
//     public static void main(String[] args) {

//         int[] a = {9, 8, 6, 5, 7};

//         for (int i = 0; i < a.length-1; i++) {
//             boolean flag = true; 

//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[i] < a[j]) {   
//                     flag = false;
//                     break;
//                 }
//             }

//             if (flag) {
//                 System.out.println(a[i] + " leader");
//             }
//         }
//     }
// }

//single loop
public class elementleader{
    public static void main(String[] args) {

        int[] a = {9,12, 8, 6, 5, 10, 7};

        int maxRight = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > maxRight) {
                System.out.println(a[i] + " leader");
                maxRight = a[i];
            }
        }
    }
}

