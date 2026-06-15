public class Subset {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,2,4};
        boolean flag = true; 
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                flag = false;
                break; 
            }
        }
        if (flag) {
            System.out.println("Yes, b is a subset of a");
        } else {
            System.out.println("No, b is not a subset of a");
        }
    }
}