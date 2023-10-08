package TopKFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class solution2 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
            a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
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
