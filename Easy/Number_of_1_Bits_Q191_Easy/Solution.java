class Solution {
    public int hammingWeight(int n) {

        // Convert the integer into its binary string representation.
        // Example: 11 -> "1011"
        String binary = Integer.toBinaryString(n);

        // Convert the binary string into a character array
        // so each bit can be checked one by one.
        char[] bits = binary.toCharArray();

        // Variable to store the count of '1' bits.
        int result = 0;

        // Traverse through every character in the bits array.
        for (int i = 0; i < bits.length; i++) {

            // If the current bit is '1',
            // increase the count.
            if (bits[i] == '1') {

                result++;

            }

        }

        // Return the total number of 1s in the binary representation.
        return result;
        
    }
}