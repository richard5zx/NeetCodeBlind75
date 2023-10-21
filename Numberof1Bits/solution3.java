package Numberof1Bits;

public class solution3 {
    // Approach 3: Flip the least significant 1 bit
    // TC: O(1)
    // SC: O(1)
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // erases the last 1 bit
            count++;
        }
        return count;
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
