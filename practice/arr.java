package practice;

public class arr {
    public static void main(String[] args) {
        // int[]a={1,2,3,4};
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        // int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        // for(int j=0;j<b.length;j++){
        //     for(int k=0;k<b[j].length;k++){
        //     System.out.print(b[j][k]);
        //     }
        //     System.out.println();
        // }
        // char []v={'v','d','h'};
        // for(int l=0;l<v.length;l++){
        //     System.out.println(v[l]);
        // }
        // String [] t={"hi","bye"};
        // for(int p=0;p<t.length;p++){
        //     System.out.println(t[p]);
        // }
        // System.out.println(a.length);
        // System.out.println(b.length);
        // System.out.println(v.length);
        // System.out.println(t.length);
        int[]a={1,2,3,4};
        int sum=0;
        for(int i=0;i<a.length;i++){
          sum+=a[i];
        }
        System.out.println("sum:"+sum);
        int avg=sum/2;
        System.out.println("Average:"+avg);


        int lar=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>lar){
                lar=a[i];
            }
        }
        System.out.println("LArgest:"+lar);


        int small=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<small){
                small=a[i];
            }
        }
        System.out.println("smallest:"+small);


        int odd=0;
        int even=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);


        int pos=0;
        int neg=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                neg++;
            }
            else{
                pos++;
            }
        }
        System.out.println("Positive:"+pos);
        System.out.println("Negative:"+neg);

        int k=3;
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                System.out.println("Index:"+i);
                break;
            }
        }
        int lar1=a[0];
        int seclar=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>lar1){
                seclar=lar1;
                lar1=a[i];
            }
        }
        System.out.println("Second LArgest:"+seclar);

        int small1=a[0];
        int secsmall=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]<small1){
                secsmall=small1;
                small1=a[i];
            }
        }
        System.out.println("Second smallest:"+secsmall);

 

        int[] b = new int[a.length];
        for(int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            b[j] = a[i];
        }
        System.out.print("Reverse:");
        for(int l=0;l<b.length;l++) {
            System.out.print(b[l]+ " ");
        }



        








    }
    
}
