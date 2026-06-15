import java.util.Scanner;
public class busstops {
    static int path[] = {800,600,750,900,1400,1200,1100,1500};
    static String busStops[] = {"TH","GA","IC","HA","TE","LU","NI","CA"};
    public static double getFare(String source,String destination){
        source = source.toUpperCase();
        destination = destination.toUpperCase();
        int sIndex = -1;
        int dIndex = -1;
        for(int i=0;i<busStops.length;i++){
            if(busStops[i].equals(source))
                sIndex=i;
            if(busStops[i].equals(destination))
                dIndex=i;
        }
        if(sIndex==-1 || dIndex==-1 || sIndex==dIndex){
            System.out.println("INVALID OUTPUT");
            return -1;
        }
        int distance=0;
        int i=sIndex;
        while(i!=dIndex){
            distance += path[i];
            i=(i+1)%busStops.length;
        }
        int fare = (distance*5/1000);
        return fare;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String source=sc.next();
        String destination=sc.next();
        double result=getFare(source,destination);
        if(result!=-1)
            System.out.println(result+" INR");
    }
}