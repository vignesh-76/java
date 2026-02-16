public class maximum {
        public static void main(String[] args){
        int[] a={10,3,4,5,-9,-5};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum ="+max);
        
    }
}
