class Solution {
    public int[] numberGame(int[] nums) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int ans[] = new int[nums.length];

        for( int i=0;i<nums.length;i++ ) minHeap.add(nums[i]);
        int ind=0;
        while( !minHeap.isEmpty() ) {
            int a = minHeap.poll();
            int b = minHeap.poll();

            ans[ind++]=b;
            ans[ind++]=a;
        }
        return ans;

    }
}