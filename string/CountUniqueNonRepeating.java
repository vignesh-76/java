package string;
public class CountUniqueNonRepeating {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "doo";

        int totalCount = 0;

        // Loop through each character in str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            // Check if ch is repeated in str2
            boolean repeated = false;
            for (int j = 0; j < str2.length(); j++) {
                if (i != j && str2.charAt(j) == ch) {
                    repeated = true;
                    break;
                }
            }
            if (repeated) continue; // skip repeated characters

            // Count occurrences of ch in str1
            int count = 0;
            for (int k = 0; k < str1.length(); k++) {
                if (str1.charAt(k) == ch) {
                    count++;
                }
            }

            totalCount += count;
        }

        System.out.println("Total occurrences: " + totalCount);
    }
}