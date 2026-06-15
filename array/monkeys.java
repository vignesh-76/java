import java.util.Scanner;

public class monkeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int j = sc.nextInt(); 
        int m = sc.nextInt();
        int p = sc.nextInt(); 
        if(n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0){
            System.out.println("INVALID INPUT");
            return;
        }
        int monkeys = (m / k) + (p / j);
        if(m % k != 0 || p % j != 0){
            monkeys++;
        }
        int remaining = n - monkeys;
        if(remaining < 0)
            remaining = 0;
        System.out.println("Number of Monkeys left on the Tree:" + remaining);
    }
}