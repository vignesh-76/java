// class Example {
//     static int counts=0;
//     Example(){
//          counts=counts+1;
//     }
//     public void disp(){

//         System.out.println("objects crated:"+counts);
//     }

// }
// class count{
//     public static void main(String[] args) {
//         Example obj1=new Example();
//         Example obj2=new Example();
//         Example obj3=new Example();
//         obj3.disp();
        
//     }
// }

class Example {
    static int count;

    static {
        count = 0;
        System.out.println("static has been initialized");
    }

    Example() {
        count++;
    }

    static void disp() {
        System.out.println("count=" + count);
    }

    public static void main(String[] args) {
        System.out.println("Drive class started:");
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example.disp();
    }
}
