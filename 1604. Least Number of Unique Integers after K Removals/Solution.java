import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of elements
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Use a priority queue to keep track of entries based on their values
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // Add all entries to the priority queue
        pq.addAll(map.entrySet());

        // Remove elements with the lowest frequencies until k becomes 0
        while (k > 0 && !pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            int freq = entry.getValue();
            if (freq <= k) {
                k -= freq;
            } else {
                // If the remaining frequency is greater than k, we cannot remove this element
                // So, add it back to the priority queue with updated frequency
                entry.setValue(freq - k);
                pq.offer(entry);
                k = 0; // No more removals can be done
            }
        }

        // The remaining size of the priority queue represents the number of unique elements
        return pq.size();
    }
}
