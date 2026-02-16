public class merge {
    public static void main(String[] args) {
        int[] a = {5, 3, 3, 6};
        int[] b={1,3,5,3};
        int d=0;
        int[]c=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[d++]=a[i];
    }
        for(int i=0;i<b.length;i++){
            c[d++]=b[i];
    }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
            
    }
}
}

