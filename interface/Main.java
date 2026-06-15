package Interface;
interface A {
    void square();
}

interface B {
    void display();
}


class C implements A, B {
    double a=3,l=2,b=4;
    double area;
    public void square(){
        area =a*a;
        System.out.println(area);
    }

    public void rectangle() {
        area=l*b;
        System.out.println(area);
     }
}
public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.square();
        obj.rectangle();
    }
}