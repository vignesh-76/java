package inheritance;
class area{
    double r;
    public void get(int r){
        this.r=r;
    }
    public void calc(){
        double area=3.14*r*r;
        System.out.println("ARea"+area);

    }
}
public class ap extends area {
    double peri;
    public  void calc(){
        peri=2*3.14*r;
        System.out.println("Perimeter::"+peri);
    }
    public static void main(String[] args) {
        area obj=new area();
        obj.get(3);
        obj.calc();
        ap obj1=new ap();
        obj1.get(4);
        obj1.calc();
    }
    
}
