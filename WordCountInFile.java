import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountInFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "file.txt";

        // Initialize word count to 0
        int wordCount = 0;

        try {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(new File(filePath));

            // Read the file line by line
            while (scanner.hasNextLine()) {
                // Read each line and split it into words using whitespace as the delimiter
                String[] words = scanner.nextLine().split("\\s+");

                // Increment the word count by the number of words in the current line
                wordCount += words.length;
            }

            // Close the scanner
            scanner.close();

            // Print the word count
            System.out.println("Number of words in the file: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
