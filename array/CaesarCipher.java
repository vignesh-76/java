import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plain text:");
        String text = sc.nextLine();
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        if(key < 0){
            System.out.println("INVALID INPUT");
            return;
        }
        String result = "";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch)){
                char c = (char)((ch - 'A' + key) % 26 + 'A');
                result += c;
            }
            else if(Character.isLowerCase(ch)){
                char c = (char)((ch - 'a' + key) % 26 + 'a');
                result += c;
            }
            else if(Character.isDigit(ch)){
                char c = (char)((ch - '0' + key) % 10 + '0');
                result += c;
            }
            else{
                result += ch;
            }
        }
        System.out.println("The encrypted message:"+result);
    }
}
