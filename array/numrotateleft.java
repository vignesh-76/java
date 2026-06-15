import java.util.Scanner;

public class numrotateleft {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = in.nextInt();

        System.out.println("Enter rotations:");
        int r = in.nextInt();

        int temp = num;
        int digits = 0;

        // Count digits
        while(temp > 0){
            digits++;
            temp = temp / 10;
        }

        int[] arr = new int[digits];

        // Fill array (from last index)
        temp = num;
        for(int i = digits - 1; i >= 0; i--){
            arr[i] = temp % 10;
            temp = temp / 10;
        }

        r = r % digits;

        // Left rotate array r times
        for(int k = 0; k < r; k++){
            int first = arr[0];
            for(int i = 0; i < digits - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[digits - 1] = first;
        }

        // Convert array back to number
        int result = 0;
        for(int i = 0; i < digits; i++){
            result = result * 10 + arr[i];
        }

        System.out.println("After rotation: " + result);
    }
}
