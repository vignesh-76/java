import java.util.Scanner;

class Circle{
    double r,area;
    private void getdata(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the r:");
        r=in.nextDouble();
    }
    public void calc(){
        getdata();
        area=3.14*r*r;
        System.out.println("Area:"+area);
    }

}

class main {
    public static void main(String[] args){
        Circle obj=new Circle();
        obj.calc();
    }

    
}
