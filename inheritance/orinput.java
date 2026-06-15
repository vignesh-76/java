package inheritance;
import java.util.Scanner;
class A3{
    int a;
    A3(){
        a=0;
    }
    public void  get(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("a:"+a);
    }
}
class orinput extends A3{
    int b;
    orinput(){
        super();
        b=0;
    }
    public void get(){
        super.get();
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
        System.out.println("b:"+b);
    }
    public static void main(String[] args)
    {
       orinput  obj=new orinput();
       obj.get();
    }
}


