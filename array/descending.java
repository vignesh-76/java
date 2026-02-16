public class descending {
        public static void main(String[] args){
        int[] a={4,6,5,1,7};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++)
            if(a[i]<a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
        }
            for(int i=0;i<a.length;i++)
            {
            System.out.println(a[i]);
            }
        }
}
