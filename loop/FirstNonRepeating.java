package loop;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {6,9,6,9,7}; 
        int result = -1; 
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                result = arr[i];
                break; 
            }
        }        
        System.out.println("First non-repeating element: " + result);
    }
}

