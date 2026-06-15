public class palindrone {
    public static void main(String [] args ){
        // Scanner in=new Scanner(System.in);
        // StringBuilder s1= new StringBuilder(in.nextLine());
        // StringBuilder s2= new StringBuilder(in.nextLine());
        // s2.reverse();
        // if(s1.toString().equals(s2.toString())){
        //     System.out.println("palindrone");
        // }
        // else{
        //     System.out.println("not palindrone");
        // }


        String s1="maam";
        String s2="maam";
        String reverse="";
        for(int i=s2.length()-1;i>=0;i--){
            reverse=s2.charAt(i)+reverse;  
        }
        if(s1.equals(reverse)){
            System.out.println("palindrone");
        }
        else{
            System.out.println("not palindrone");
        }
    }
    
}
