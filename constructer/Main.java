
class Factorial{
    int n,fact;
    Factorial(){
        fact=1;
        n=5;
    }
    public void calc(){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }

}
public class Main{
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.calc();
    }
    
}