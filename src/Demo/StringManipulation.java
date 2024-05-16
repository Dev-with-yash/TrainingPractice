package Demo;

public class StringManipulation {

    public static String manipulateStrings(String str1, String str2, int length) {
        // Concatenate the two strings
        String concatenated = str1.concat(str2);

        // Reverse the concatenated string
        String reversed = new StringBuilder(concatenated).reverse().toString();

        // Edge case: Handle negative substring length
        if (length < 0) {
            return ""; // Return empty string for negative length
        }

        // Determine the middle index for the substring
        int middleIndex = reversed.length() / 2;

        // Calculate the starting index for the substring
        int startIndex = middleIndex - length / 2;

        // Edge case: Adjust startIndex if the substring length exceeds the reversed string length
        if (length > reversed.length()) {
            startIndex = 0; // Take the entire reversed string
        } else if (startIndex < 0) {
            startIndex = 0; // Adjust to start from the beginning
        }

        // Extract the middle substring of the specified length
        String middleSubstring = "";
        if (startIndex >= 0 && startIndex + length <= reversed.length()) {
            middleSubstring = reversed.substring(startIndex, startIndex + length);
        }

        return middleSubstring;
    }

    public static void main(String[] args) {
        // Test cases
        runTest("", "", 5); // Both strings are empty
        runTest("abc", "def", 0); // Substring length is zero
        runTest("hello", "world", 5); // Normal case
        runTest("example", "strings", 4); // Extracting middle substring
        runTest("", "xyz", 3); // First string is empty
        runTest("123", "", 4); // Second string is empty
        runTest("foo", "bar", 6); // Substring length exactly equals concatenated length
        runTest("apple", "orange", 10); // Substring length greater than concatenated length
        runTest("word", "java", -2); // Negative substring length
    }

    // Helper method to run a test case and print the result
    private static void runTest(String str1, String str2, int length) {
        String result = manipulateStrings(str1, str2, length);
        System.out.println("Strings: \"" + str1 + "\", \"" + str2 + "\" | Substring Length: " + length + " | Result: \"" + result + "\"");
    }
}
