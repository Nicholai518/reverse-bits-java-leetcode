public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // result to be returned
        int result = 0;

        // iterate through n
        // less than 32 because each argument will be 32 bits
        for (int i = 0; i < 32; i++) {
            // left shift result
            result <<= 1;

            // if the bit is 1, add 1
            if ((n & 1) > 0) {
                // all bits 0 by default
                // adds 1
                result++;
            }

            // right shift
            n >>= 1;
        }
        return result;
    }
}
