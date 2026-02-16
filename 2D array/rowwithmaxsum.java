public class rowwithmaxsum {
    public static void main(String []args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        int r;
        for(int i=0;i<a.length;i++){
            r=0;
            for(int j=0;j<a[i].length;j++){
                r+=a[i][j];
                if(r>max){
                    max=r;
                }
            }
        }
        System.out.println(max);
    }
    
}
