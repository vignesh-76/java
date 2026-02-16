public class secmax {
    public static void main(String[] args) {

        int[] a = {4,3, 2, 4, -2, 4, 1, 1};
        int max=a[0];
        int secmax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secmax=max;
                max=a[i];
            }
            else if(a[i]>secmax&&a[i]!=max){
                secmax=a[i];
            }

        }

        System.out.println(secmax);
    }
}
    

