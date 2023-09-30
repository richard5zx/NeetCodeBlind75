package GroupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Categorize by Sorting
public class solution1 {
    public static void main(String[] args) {
        String[] input1 = {"eat","tea","tan","ate","nat","bat"};
        String[] input2 = {""};
        String[] input3 = {"a"};

        System.out.println(groupAnagrams(input1));
        System.out.println(groupAnagrams(input2));
        System.out.println(groupAnagrams(input3));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
