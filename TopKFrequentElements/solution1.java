package TopKFrequentElements;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Bucket Sort solution
// TC: O(n)
// SC: O(n)
public class solution1 {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];                
        
        // Populate map
        for (int num : nums)
            count.merge(num, 1, Integer::sum);
        
        // Populate bucket
        for (int key : count.keySet()){
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        // Get result from bucket
        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 1, 1, 2, 2, 3};
        int kInput1 = 2;

        int[] input2 = {1};
        int kInput2 = 1;

        int[] input3 = {1, 1, 1, 1, 2, 2, 3, 3, 4};
        int kInput3 = 2;

        printArray(topKFrequent(input1, kInput1));
        printArray(topKFrequent(input2, kInput2));
        printArray(topKFrequent(input3, kInput3));
    }

    public static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
