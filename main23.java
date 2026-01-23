import java.util.Scanner;
public class main23 {
    public static void main(String [] args){
        char c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a h or t:");
        c=in.next().charAt(0);
        if(c=='h'){
            System.out.println("you are lucky");
        }
    }
    
}
