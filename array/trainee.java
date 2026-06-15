import java.util.Scanner;

public class trainee {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int r = 3;
        int t1[] = new int[r];
        int t2[] = new int[r];
        int t3[] = new int[r];
        for(int i=0;i<r;i++){
            t1[i] = in.nextInt();
            t2[i] = in.nextInt();
            t3[i] = in.nextInt();
            if((t1[i]<1||t1[i]>100)||(t2[i]<1||t2[i]>100)||(t3[i]<1||t3[i]>100)){
                System.out.println("INVALID INPUT");
                return;
            }
        }
        int temp1=0,temp2=0,temp3=0;

        for(int i=0;i<r;i++){
            temp1 += t1[i];
            temp2 += t2[i];
            temp3 += t3[i];
        }
        int rt1 = temp1/r;
        int rt2 = temp2/r;
        int rt3 = temp3/r;

        int max = Math.max(rt1, Math.max(rt2, rt3));

        if(max < 70){
            System.out.println("All trainees are unfit");
            return;
        }

        if(rt1 == max)
            System.out.println("Trainee Number : 1");

        if(rt2 == max)
            System.out.println("Trainee Number : 2");

        if(rt3 == max)
            System.out.println("Trainee Number : 3");
    }
}