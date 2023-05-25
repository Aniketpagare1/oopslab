import java.util.Arrays;
import java.util.Scanner;

public class Strings3COMBOSORT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 strings from the console
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String string : strings) {
            System.out.println(string);
        }

        // Combine two strings
        String combinedString = strings[0] + strings[1];
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string
        String reversedString = reverseString(strings[0]);
        System.out.println("Reversed first string: " + reversedString);
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
