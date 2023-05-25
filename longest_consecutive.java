import java.util.*;
public class longest_consecutive {
    public static int findLongestConsecutiveSequence(int[] nums) {
        int longestSequence = 0;

        // Sort the array in ascending order
        Arrays.sort(nums);

        int currentSequence = 1;

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is consecutive to the previous element
            if (nums[i] == nums[i - 1] + 1) {
                currentSequence++;
            } else if (nums[i] != nums[i - 1]) {
                // Reset the current sequence if the current element is not equal to the previous element
                currentSequence = 1;
            }

            // Update the longest sequence if necessary
            longestSequence = Math.max(longestSequence, currentSequence);
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int longestSequence = findLongestConsecutiveSequence(nums);
        System.out.println("The longest consecutive elements sequence has a length of: " + longestSequence);
    }
}
