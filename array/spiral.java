public class spiral {
    public static void main(String[] args) {

        int [][] a={{1,2,3},
                    {4,5,4},
                    {7,8,9},
                    };

        int n = a.length;
        int m = a[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        String r = "";

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                r += a[top][i];
            }
            top++;
            for(int i = top; i <= bottom; i++){
                r += a[i][right];
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    r += a[bottom][i];
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    r += a[i][left];
                }
                left++;
            }
        }

        System.out.println(r);
    }
}

       