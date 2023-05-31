public class RemoveDups {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        String[] resultArray = removeDuplicates(inputArray);

        // Output the result array
        for (String str : resultArray) {
            System.out.println(str);
        }
    }

    public static String[] removeDuplicates(String[] inputArray) {
        // Create a new array list to store unique strings
        ArrayList<String> uniqueStrings = new ArrayList<>();

        // Iterate through the input array
        for (String str : inputArray) {
            // Check if the string is not null and not already present in the uniqueStrings list
            if (str != null && !uniqueStrings.contains(str)) {
                uniqueStrings.add(str);
            }
        }

        // Create a new array to store the result
        String[] resultArray = new String[uniqueStrings.size()];

        // Copy the elements from the uniqueStrings list to the result array
        for (int i = 0; i < uniqueStrings.size(); i++) {
            resultArray[i] = uniqueStrings.get(i);
        }

        return resultArray;
    }
}
