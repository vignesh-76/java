public class unique {
        public static void main(String[] args) {
        int[] a = {5, 3, 3, 6, 3, 6, 6, 1, 2,8};
        int uniqueCount = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j =0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                
                }
            }

            if (count == 1) {
                
                uniqueCount++;
            }
        }

        System.out.println(uniqueCount);
    }
}


