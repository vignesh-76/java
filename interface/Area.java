package Interface;
interface Circle{
    double pai=3.14;
    public void calc();
    }
class Area implements Circle {
    double r;
    Area(double radius){
        this.r = r;
    }
    public  void calc(){
        double area=pai*r*r;
    System.out.println(area);
    
}
public static void main(String[] s) {
    Area obj=new Area(10);
    obj.calc();
}

}
