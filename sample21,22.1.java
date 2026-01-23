import java.util.Scanner;
class java{
    public static void main(String args[]){
        int a=10;
        // System.out.println(a++ +" "+ ++a +" "+ a);
        // System.out.println(++a +" "+ a +" "+ a++);
        // System.out.println(a++ +" "+ a +" "+ a++);

        // boolean b;
        // b=5>3;
        // System.out.println(b);
        // int v=12;
        // int p=9;

        // System.out.println((v<p)&(3>9));
        // System.out.println((v<p)&&(3>9));
        // System.out.println(1987*10-29);
        // int x,y,z;
        // x=20;
        // y=9;
        // z=(x>y)?x:y;
        // System.out.println(z);
        
        // int num=30;
        // String result=(num%2==0)?"EVEn":"ODD";
        // System.out.println(result);

        // int a1=23,b1=46, c1=28;
        // int max=(a1<b1)?((a1>c1)?a1:c1):((b1>c1)?b1:c1);
        // System.out.println(max);

        // int s2=13;
        // String sol=(s2>0)?"positive":(s2==0)?"zero":"negative"; 
        // System.out.println(sol);

        // int age=17;
        // String ans =(age<18)?"Minor":"major";
        // System.out.println(ans);

        // int di=100;
        // String hi=(di>999 && di<=9999)?"four digit number":"not a four digit number";
        // System.out.println(hi);

        // int w=423,e=526;
        // System.out.println(w^e);

        //////////AFTERNOON
        /// 
        /// 
        // System.out.println('A'+'B'+"hai");
        // System.out.println('A'+"B"+'C');
        // System.out.println('A'+10+'B'+"hai");
        // System.out.println(true+"false"+true);

        // System.out.println("example"+(3+2)+5);
        // System.out.println('A'+'B'+"hai");
        // System.out.println('A'+'B'+"hai");
        // System.out.println(2*5/3);
        // System.out.println(10 + +10 * 2);
        // System.out.println(10*2/4%3);
        

        // int m1=943;
        // System.out.println(m1<<3);






        //INSTRUCTIONS
        Scanner hi=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a,b,c;
        a=hi.nextInt();
        b=hi.nextInt();
        c=a+b;
        System.out.println("sum:"+c);

        System.out.println("Enter radius:");
        float r=hi.nextFloat();
        float area=3.14f*r*r;
        System.out.println("Area of circle: "+area);

        System.out.println("Enter celsius");
        float celsius=hi.nextFloat();
        float fahrenheit=(celsius*9/5)+32;  
        System.out.println("Fahrenheit: "+fahrenheit);

        System.out.println("Enter Fahrenheit:");
        float fah=hi.nextFloat();
        float c2=(fah-32)*5/9;
        System.out.println("Celsius: "+c2);

        System.out.println("Enter length of triangle:");
        float l1=hi.nextFloat();
        System.out.println("Enter breadth of triangle:");
        float b1=hi.nextFloat(); 
        System.out.print("Enter height of triangle:");
        float h1=hi.nextFloat();
        System.out.println("permiter of triangle:"+(l1+b1+h1));

        


        

        
       
        
         
    }
}