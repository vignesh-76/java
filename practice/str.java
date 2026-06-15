package prac;
public class str{
    public static void main(String [] args){


    //     String name ="Vignesh";
    //     System.out.println(name.length());

    //     System.out.println(name.toUpperCase());

    //     System.out.println(name.toLowerCase());
    //     int vowel=0;
    //     int con=0;
    //     for(int i=0;i<name.length();i++){
    //         char ch=name.charAt(i);
    //         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //             vowel++;
    //         }
    //         else{
    //             con++;
    //         }
    //     }
    //     System.out.println("Vowel:"+vowel);
    //     System.out.println("Consonant:"+con);

    //    String str = "mom is a good person";
    //     String reversed = new StringBuilder(str).reverse().toString();
    //     System.out.println("Reversed: " + reversed);
    //     if(str.equals(reversed)){
    //         System.out.println("palinrdome");
    //     }
    //     else{
    //         System.out.println("NOt a palindrome");
    //     }
           
    //     String sentence = "The quick browni fox jumps over the lazy dog";

    //     String[] words = sentence.split(" ");
    //     String longest = "";
    //     for (String word : words) {
    //         if (word.length() > longest.length()) {
    //             longest = word;
    //         }
    //     }
    //     System.out.println(longest);
        

        String str1 = "Hello World Java Program";
        
        String[] words = str1.trim().split("\\s+");
        int wordCount = words.length;
        
        System.out.println("Number of words: " + wordCount);
        String noSpaces = str1.replaceAll("\\s+", "");
        System.out.println("Without spaces: " + noSpaces);

        
    }
}

        
    