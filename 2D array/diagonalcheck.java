public class diagonalcheck {
    public static void main(String[] args) {
        int[][] a = {{1,2,0,0},{0,2,0,0}, {0,0,3,0},{0,0,0,4}};
   
        boolean flag=true;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=0||i!=j){
                    flag=false;
                }
         }
         if(flag==false){
            break;
            
         }
        }
            if(flag==true){
                System.out.println("Diagonal matrix");
            }
            else{
                System.out.println("not a diagonal");
            }
    }
}


    
