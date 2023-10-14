package Numberof1Bits;

public class solution3 {
    // Approach 3: Flip the least significant 1 bit + recursive
    // TC: O(1)
    // SC: O(1)
    public static int hammingWeight(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        return hammingWeight(n & (n - 1)) + 1;
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
