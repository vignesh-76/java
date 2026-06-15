import java.util.Scanner;

public class vending {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] c = {"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String[] t = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String[] s = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String[] b = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

        char ch = in.next().charAt(0);
        int n = in.nextInt();

        if(ch=='c'){
            if(n>=1 && n<=c.length){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your " + c[n-1]);
            }else{
                System.out.println("INVALID INPUT");
            }
        }

        else if(ch=='t'){
            if(n>=1 && n<=t.length){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your " + t[n-1]);
            }else{
                System.out.println("INVALID INPUT");
            }
        }

        else if(ch=='s'){
            if(n>=1 && n<=s.length){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your " + s[n-1]);
            }else{
                System.out.println("INVALID INPUT");
            }
        }

        else if(ch=='b'){
            if(n>=1 && n<=b.length){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your " + b[n-1]);
            }else{
                System.out.println("INVALID INPUT");
            }
        }

        else{
            System.out.println("INVALID INPUT");
        }
    }
}