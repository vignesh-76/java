package loop;

public class perfect {
    public static void main(String[] args) {
        int n=18;
        int temp=n;int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        if(n%sum==0){
            System.out.print("Good nummber");
        }
        else{
            System.out.print("Not a good number");
        }
    }
    
}
