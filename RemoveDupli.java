public class RemoveDupli {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) { // If the array has 0 or 1 element, there are no duplicates
            return n; // Return the original length
        }
        
        int[] temp = new int[n]; // Create a temporary array to store unique elements
        int j = 0; // Index for the temporary array
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) { // Check if the current element is different from the next element
                temp[j++] = arr[i]; // If different, store the current element in the temporary array
            }
        }
        
        temp[j++] = arr[n - 1]; // Store the last element of the original array in the temporary array
        
        // Changing original array by copying elements from the temporary array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i]; // Copy elements from the temporary array back to the original array
        }
        
        return j; // Return the new length of the modified array without duplicates
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        
        // Printing array elements
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
