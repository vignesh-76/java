public class para {
    public static void main(String [] args){
        rectangle obj=new rectangle();
        obj.area(); 
        obj.perimeter();
    }
    
}
class rectangle{
    int l,b;
    int area,perimeter;
    rectangle(){
        l=5;
        b=5;
    }
    public void area(){
        area=l*b;
        System.out.println("Area:"+area);
    }
    public void perimeter(){
        perimeter=l+b;
        System.out.println("Perimeter:"+perimeter);
    }
}
