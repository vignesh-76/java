public class gretleft {
    public static void main(String[] args) {
        int [] a={7,4,8,2,9};
        // int count=0;
        // for(int i=0;i<a.length;i++){
        //     boolean res=true;
        //     for(int j=i-1;j>=0;j--){
        //         if(a[i]<a[j]){
        //             res=false;
        //             break;
        //         }
        //     }
        //     if(res==true)
        //         count++;
        int count=1;
        int max=a[0];
        for(int i=-0;i<a.length;i++){
            if(a[i]>max){
                count++;
                max=a[i];
            }
        }   
        System.out.println(count);
    }
}
