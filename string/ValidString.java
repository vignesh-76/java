package string;

import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int star = 0;
        int hash = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '*'){
                star++;
            }
            else if(c == '#'){
                hash++;
            }
        }

        int result = star - hash;
        System.out.println(result);
    }
}
    

