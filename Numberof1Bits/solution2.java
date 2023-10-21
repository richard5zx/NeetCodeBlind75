package Numberof1Bits;

public class solution2 {
    // Approach 2: Loop and count each bit and count (using % operation)
    // TC: O(32) = O(1)
    // SC: O(1)
    public static int hammingWeight(int n) {
        int numOfBits = 0;
        
        for(int i = 0; i < 32; i++) {
            if((n % 2) != 0) {
                numOfBits++;
            }
            n = n >> 1;
        }
        return numOfBits;
    }

    public static void main(String[] args) {
        // Approach 2: Loop and count each bit and count (using % operation)
        // Binary Representation: 00000000000000000000000000001011
        // Decimal Representation: 11
        int input1 = 11;
        System.out.println(hammingWeight(input1));

        // Binary Representation: 00000000000000000000000010000000
        // Decimal Representation: 128
        int input2 = 128;
        System.out.println(hammingWeight(input2));

        // Binary Representation: 11111111111111111111111111111101
        // Decimal Representation: -3
        int input3 = -3;
        System.out.println(hammingWeight(input3));
    }
}
