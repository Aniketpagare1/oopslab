public class stringRev {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters of the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Append each character to the StringBuilder
        }

        return reversed.toString();
    }
}
