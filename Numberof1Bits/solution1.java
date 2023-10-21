package Numberof1Bits;

public class solution1 {
    // Approach 1: Loop and count each bit and count (using & operation)
    // TC: O(32) = O(1)
    // SC: O(1)
    public static int hammingWeight(int n) {
    
        int bits = 0;
        int mask = 1;
        
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask = mask << 1;
        }
        return bits;
    }

    public static void main(String args[]) {
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
