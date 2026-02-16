public class secmin {
        public static void main(String[] args){
        int[] a={10,20,35,40,36,5};
        int min=a[0];
        int secmin=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                
                secmin=min;
                min=a[i]; 
            }
            else if(a[i]<secmin&&a[i]!=min)
            {
                secmin=a[i];
            }

        }
        System.out.println("Minimum ="+min);
        System.out.println("Second Minimum="+secmin);
        
    }
    
}

