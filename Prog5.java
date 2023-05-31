public class Prog5 {
    public static void main(String[] args) {
        int[] arrayA = {5, 6, -4, 3, 1};
        int[] arrayB = {3, 8, 9, 11};

        int[] combinedArray = combine(arrayA, arrayB);

        // Output the combined array
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] combine(int[] a, int[] b) {
        // Calculate the size of the combined array
        int combinedLength = a.length + b.length;

        // Create a new array to store the combined elements
        int[] combinedArray = new int[combinedLength];

        // Copy elements from array a to the combined array
        for (int i = 0; i < a.length; i++) {
            combinedArray[i] = a[i];
        }

        // Copy elements from array b to the combined array
        for (int i = 0; i < b.length; i++) {
            combinedArray[a.length + i] = b[i];
        }

        return combinedArray;
    }
}
