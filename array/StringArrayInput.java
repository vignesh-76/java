
import java.util.Scanner;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = in.nextInt();
        in.nextLine(); 

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = in.nextLine();
        }

        System.out.println("\nStrings entered are:");
        for (int i = 0; i < n; i++) {
            
         if (arr[i].contains("r") || 
        arr[i].contains("e") || 
        arr[i].contains("v")) {
        
        System.out.println(arr[i]);
    }
}
            }
            
        }

