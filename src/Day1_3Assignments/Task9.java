package Day1_3Assignments;

public class Task9 {

    public static String getMiddleSubstring(String str1, String str2, int length) {

        String concatenated = str1.concat(str2);


        String reversed = new StringBuilder(concatenated).reverse().toString();


        int startIndex = (reversed.length() - length) / 2;

        if (startIndex < 0) {
            startIndex = 0;
        }


        int endIndex = startIndex + length;


        if (endIndex > reversed.length()) {
            endIndex = reversed.length();
        }


        String middleSubstring = reversed.substring(startIndex, endIndex);

        return middleSubstring;
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "yaswanth";
        String str2 = "World";

        int length = 4;

        String result = getMiddleSubstring(str1, str2, length);
        System.out.println("Middle substring of length " + length + ": " + result);


        String emptyStr1 = "";
        String emptyStr2 = "";
        int largeLength = 10;

        String emptyResult = getMiddleSubstring(emptyStr1, emptyStr2, largeLength);
        System.out.println("Middle substring of length " + largeLength + " from empty strings: " + emptyResult);
    }
}

