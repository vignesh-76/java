public class search {
        public static void main(String[] args) {
        int[] a = {5, 3, 6, 1, 2};
        boolean is=true;
        int t=2;
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                is=true;
            }
        }
        if(is){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
        }
}
