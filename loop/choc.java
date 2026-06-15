package loop;

public class choc {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        int j = 0;
        // move non-zero elements to front
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        // fill remaining places with 0
        while(j < arr.length){
            arr[j] = 0;
            j++;
        }
        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
