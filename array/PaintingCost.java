import java.util.Scanner;
public class PaintingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interiorWalls = sc.nextInt();
        int exteriorWalls = sc.nextInt();
        double interiorArea = 0;
        double exteriorArea = 0;
        
        if(interiorWalls > 0){
            for(int i = 0; i < interiorWalls; i++){
                interiorArea += sc.nextDouble();
            }
        }

        if(exteriorWalls > 0){
            for(int i = 0; i < exteriorWalls; i++){
                exteriorArea += sc.nextDouble();
            }
        }
        double interiorCost = interiorArea * 18;
        double exteriorCost = exteriorArea * 12;
        double totalCost = interiorCost + exteriorCost;
        System.out.println("Total estimated Cost : " + totalCost + " INR");
    }
}