public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Find the size of the resulting array (common elements)
        int maxSize = Math.min(arr1.length, arr2.length);
        int[] commonArray = new int[maxSize]; // Array to store common elements
        int commonCount = 0; // Count of common elements

        // Iterate through elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];

            // Check if the element is present in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == num) {
                    commonArray[commonCount++] = num; // Store the common element
                    break;
                }
            }
        }

        // Print the common elements
        System.out.print("Common Elements: ");
        for (int i = 0; i < commonCount; i++) {
            System.out.print(commonArray[i] + " ");
        }
    }
}
