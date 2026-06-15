package inheritance;
class Q{
    protected int q;
    Q(int q){
        this.q=q;
    }
}
class W extends  Q{
    int w;
    W(int w,int q){
        super(q);
        this.w=w;
    }
}
class E extends W{
    int e;
    E(int q,int w,int e){
        super(w,q);
        this.e=e;
    }
}
public class try1 {
    int c;
    public void multiply(E obj){
        c=obj.q*obj.w*obj.e;
        System.out.println(c);
    }
    public static void main(String[] args) {
        E obj=new E(2,3,4);
        try1 obj1=new try1();
        obj1.multiply(obj);

    }
    
}
