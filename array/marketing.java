import java.util.Scanner;

public class marketing {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String parent = in.nextLine();
        char ques = in.next().charAt(0);

        int schemeAmount = 5000;
        int parentComm = (schemeAmount * 10) / 100;  
        int childComm = (schemeAmount * 5) / 100;     
        int count = 1;

        if (ques == 'N') {
            System.out.println("TOTAL MEMBERS:1");
            System.out.println("COMISSION DETAILS");
            System.out.println(parent + ": " + childComm + " INR");
            return;
        }

        in.nextLine(); // clear buffer
        String child = in.nextLine();

        for (int i = 0; i < child.length(); i++) {
            if (child.charAt(i) == ',') {
                count++;
            }
        }

        String[] children = child.split(",");

        System.out.println("TOTAL MEMBERS:" + (count + 1));
        System.out.println("COMISSION DETAILS");

        System.out.println(parent + ": " + (parentComm * count) + " INR");

        for (int i = 0; i < children.length; i++) {
            System.out.println(children[i].trim() + " :" + childComm + " INR");
        }
    }
}