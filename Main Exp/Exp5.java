public class Exp5 {

    public static char findMaxOfferingCharacter(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
        }

        char maxOfferingChar = input.charAt(0);
        int maxOfferingValue = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int currentOfferingValue = currentChar;

            if (currentOfferingValue > maxOfferingValue) {
                maxOfferingChar = currentChar;
                maxOfferingValue = currentOfferingValue;
            }
        }

        return maxOfferingChar;
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        char maxOfferingChar = findMaxOfferingCharacter(input);

        System.out.println("Input String: " + input);
        System.out.println("Character with Maximum Offering Value: " + maxOfferingChar);
    }
}
