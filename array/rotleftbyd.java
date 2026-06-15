class rotleftbyd{
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int d=2;
        d=d%arr.length;
        // for(int i=0;i<d;i++){
        //     int temp=arr[0];
        //     for(int j=0;j<arr.length-1;j++){
        //     arr[j]=arr[j+1];
        // }
        // arr[arr.length-1]=temp;
        // }

        //right rotation
        for(int i=0;i<d;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}