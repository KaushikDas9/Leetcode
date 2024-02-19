class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        HashSet<Integer> set = new HashSet<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            set.add(entry.getValue());
        }

        for (Integer i : set) {

            pq.add(i);
        }

        int[] ans = new int[k];
        int index = 0;

        while (k> 0) {

            int temp = pq.poll();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (temp == entry.getValue()) {
                    ans[index++] = entry.getKey();k--;
                }

            }

        }

        return ans;

    }
}