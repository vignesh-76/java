package inheritance;
import java.util.Scanner;
class A4{
    int a;
    A4(){
        a=0;
    }
    public void get(int a){
        this.a=a;
        System.out.println("a="+a);
    }
}
public class olinput extends A4 {
    int b;
    olinput(){
        super();
        b=0;
    }
    public void get(){
        super.get(5);
        Scanner in=new Scanner(System.in);
        b=in.nextInt();

    }
    public static void main(String []args){
        olinput obj=new olinput();
        obj.get();
        
        

    }

    
}
