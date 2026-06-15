package abstractclass;

abstract class Shape{
    double area;
    abstract public void calc();
}
class Circle1 extends Shape{
    double r;
    Circle1(int r){
        this.r=r;
    }
    public void calc(){
        area=3.14*r*r;
        System.out.println("Area:"+area);
    }
}
public class abmain {
    public static void main(String[] args) {
        Circle1 C=new Circle1(10);
        C.calc();
    }
}