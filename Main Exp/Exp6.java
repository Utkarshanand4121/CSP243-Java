public class Exp6 {
    public static char findFirstNon(String str) {
        int[] charCount = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "programming";
        char firstNonRepeating = findFirstNon(input);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character.");
        }
    }
}
