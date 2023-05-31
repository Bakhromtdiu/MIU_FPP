public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minimum = min(arrayOfInts);

        // Output the minimum value
        System.out.println("Minimum: " + minimum);
    }

    public static int min(int[] arrayOfInts) {
        // Check if the array is empty
        if (arrayOfInts.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Set the first element as the initial minimum value
        int min = arrayOfInts[0];

        // Iterate through the remaining elements of the array
        for (int i = 1; i < arrayOfInts.length; i++) {
            // Update the minimum value if a smaller value is found
            if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
        }

        return min;
    }
}
