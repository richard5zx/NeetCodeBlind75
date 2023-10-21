package Numberof1Bits;

import java.util.Scanner;

public class prac1 {
    // Print binary representation of an integer
    public static void printBit(int n) {
        int originalMask = 1;
        int numberOfBits = 32;
        int mask;
        
        System.out.print("Binary representation of " + n + " is: ");
        for (int i = 1; i <= numberOfBits; i++) {
            mask = originalMask << numberOfBits - i; 
            if ((mask & n) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {

        System.out.print("Enter Integer: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        printBit(input);
    }
}
