public class exstatic {
    static int count=0;
    static String college="HICET";
    String name;
    exstatic(String name){
        this.name=name;
        count++;
    }
    public void disp(){
        System.out.println(name+" studies@ "+college);
        
    }
    public static void main(String[] args) {
        exstatic obj1=new exstatic("Ramya");
        exstatic obj2=new exstatic("Vignesh");
        exstatic obj3=new exstatic("Saran");
        obj1.disp();
        obj2.disp();
        obj3.disp();
        System.out.println(count);
    }
}
