
package Length_of_Last_Word_Q58_Easy;

class Solution {
    public int lengthOfLastWord(String s) {

        // Variable to store the final answer
        int result = 0;

        // Split the string into words using space
        String[] words = s.split(" ");

        // Create another array to store words
        String[] array = new String[words.length];

        // Variable to store the last word
        String lastWord = "";

        // Loop through all words
        for (int i = 0; i < words.length; i++) {

            // Store current word into array
            array[i] = words[i];

            // Check if current word is the last word
            if (i == words.length - 1) {

                // Store the last word
                lastWord = words[i];

            }

        }

        // Get length of the last word
        result = lastWord.length();

        // Return final result
        return result;

    }
}