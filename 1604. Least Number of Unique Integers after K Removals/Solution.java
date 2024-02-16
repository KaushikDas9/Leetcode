import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Count the number of unique elements
        int uniqueCount = freqMap.size();

        // Store frequencies in a list
        List<Integer> frequencies = new ArrayList<>(freqMap.values());

        // Sort frequencies in ascending order
        Collections.sort(frequencies);

        // Iterate through frequencies and decrement k
        for (int freq : frequencies) {
            if (k >= freq) {
                k -= freq;
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
}
