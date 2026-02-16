public class duplicate {
        public static void main(String[] args) {
        int[] a = {5, 3, 3, 6, 3, 6, 6, 1, 2, 2};
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            boolean already = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    already = true;
                    break;
                }
            }
            if (already) continue;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
