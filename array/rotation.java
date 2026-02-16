public class rotation {
    public static void main(String[] args) {

        int[] a = {1,2,3,3,4,5};
        int[] b = {2,3,3,4,5,1};
        if (a.length == b.length) {
            int n = a.length;
            boolean flag = false;
            for (int i = 0; i < n; i++) {   
                int count = 0;
                
                for (int j = 0; j < n; j++) {  
                    if (a[(i + j) % n] == b[j]) {
                        count++;
                    } 
                    else{
                        break;
                    }
                }

                if (count == n) {
                    flag = true;
                    break;
                    
                }
            }
            if (flag)
                System.out.println("rotation");
            else
                System.out.println("not rotation");
        }
        else{
            System.out.println("Not a rotation");
        }
    }
}

    

