package GroupAnagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Categorize by Frequency
public class solution2 {
    public static void main(String[] args) {
        String[] input1 = {"eat","tea","tan","ate","nat","bat"};
        String[] input2 = {""};
        String[] input3 = {"a"};

        System.out.println(groupAnagrams(input1));
        System.out.println(groupAnagrams(input2));
        System.out.println(groupAnagrams(input3));
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Create frequency string for the word
            String frequencyString = getFrequencyString(word);
            
            // If frequency string is in map -> append
            if (map.containsKey(frequencyString)) {
                map.get(frequencyString).add(word);
            } else { // If frequency string is not in map -> create new key and list
                List<String> stringList = new ArrayList<>();
                stringList.add(word);
                map.put(frequencyString, stringList);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String getFrequencyString(String string) {
        // Create frequency bucket
        int[] freqArray = new int[26];

        // Iterate over each character
        for (char c : string.toCharArray()) {
            freqArray[c - 'a']++;
        }
        
        // Build frequency string using frequency bucket
        StringBuilder freqString = new StringBuilder("");
        char c = 'a';

        for (int i : freqArray) {
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();
    }
}
