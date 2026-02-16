public class countEandO {
        public static void main(String[] args) {
        int[] a = {5, 3, 6, 1, 2};
        int odd=0;
        int even=0;

        for(int i=0;i<a.length;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
