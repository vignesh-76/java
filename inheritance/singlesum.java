package inheritance;
import java.util.Scanner;
class A{
    int a,b;
    public  void getdata(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
}
public class singlesum extends A{
    int c;
    public void singlesum(){
    c=a+b;
    System.out.println("Sum:"+c);
}    
    public static void main(String[] s) {
    singlesum obj=new singlesum();
    obj.getdata();
    obj.singlesum();
}
}
